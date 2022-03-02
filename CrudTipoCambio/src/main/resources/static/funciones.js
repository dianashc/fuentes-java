function eliminar(id) {
	swal({
		title: "¿Está seguro de eliminar?",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/eliminar/" + id,
					success: function(res){
						console.log(res);
					}
				});
				swal("Se eliminó el registro con id " + id, {
					icon: "success",
				}).then ((OK) => {
					if(OK){
						location.href="/listarMonedas"
					}
				});
			} else {
				swal("Se canceló la eliminación del registro con id " + id);
			}
		});
}