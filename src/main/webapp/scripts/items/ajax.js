$(document).ready(function(){
	
	
	$("body").on("click","#botonBorrarFormulario", function(event){
		$("#formNombre").val("");
		$("#formDescripcion").val("");
		$("#formEstado").val("");
		$("#formPrecio").val("");
		
		
	});
	

	$("body").on("click","#botonAjaxAgregar", function(event){
		var nombre = $("#formNombre").val();
		var precio = $("#formPrecio").val();
		var descripcion = $("#formDescripcion").val();
		//var estado = $("#formEstado").val();
		if($("#formEstado").is(':checked') ) {
		    estado=true;
		}else{
			estado=false;
		}
		var url = "../items/";
		var data = JSON.stringify({nombre:nombre,descripcion:descripcion,precio:precio,estado:estado});
		$.ajax({
			type:'POST',
			contentType: 'application/json',
			headers: {Accept: 'application/json'},
			url: url,
			data: data,
			success: function() {},
			complete: function() {
				cargarLista();
			}
		});
	});
	
	$("body").on("click","#botonAjaxEditar", function(event){
		
		var id = $("#formId").val();
		var nombre = $("#formNombre").val();
		var precio = $("#formPrecio").val();
		var descripcion = $("#formDescripcion").val();
		//var estado = $("#formEstado").val();
		if($("#formEstado").is(':checked') ) {
		    estado=true;
		}else{
			estado=false;
		}
		var url = "../items/"+id;
		var data = JSON.stringify(data = {id:id,nombre:nombre,descripcion:descripcion,precio:precio,estado:estado});
		$.ajax({
			type:'PUT',
			headers: {Accept: 'application/json'},
			url: url,
			data: data,
			success: function() {},
			complete: function() {
				cargarLista();
			}
		});
	});

	$(document).ready(function(){
		
		cargarLista();
		
	});

	$("body").on("click","#botonVer", function(event){
		var id = $(this).data("id");
		var url = "../items/"+id;
		$.ajax({
			type:'GET',
			headers: {Accept: 'application/json'},
			url: url,
			data: {},
			success: function(data) {
										$("#formId").val(data.id),
										$("#formNombre").val(data.nombre),
										$("#formDescripcion").val(data.descripcion),
										//$("#formEstado").val(data.estado),
										$("#formPrecio").val(data.precio);
									},
			complete: function() {
				
				cargarLista();
			}
		});
	});
	
	
	
	function cargarLista(){
		//var id = $(this).data("id");
		var url = "../items";
		$.ajax({
			type:'GET',
			headers: {Accept: 'application/json'},
			url: url,
			data: {},
			success: function(data) {
				//if(data.length != 0){
					
				var datoHTML = "<tr><td>Nombre</td><td>Negocio</td><td>ID</td><td></td></tr>";
					
					$.each(data, function(i, val){
								datoHTML += "<tr>"+"<td>"+val.nombre+"</td>"+"<td>"+val.negocio.nya+"</td>" +
								"<td>"+val.id+"</td>" +
								"<td><a href='#' title='Editar' id='botonVer' data-id='"+val.id+"'>"+
												"<span class='glyphicon glyphicon-edit' aria-hidden='true'></span>"+
												"</a></td>";
						
						
						
						
					});
					
				
				
					$("#contenidoTabla").html(datoHTML);
			}
		});
	}
});