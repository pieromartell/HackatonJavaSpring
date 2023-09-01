function sendData(event) {
    event.preventDefault();
    
    const formData = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        username: document.getElementById('username').value,
        password: document.getElementById('password').value,
        estado: true,
        roles:{
			idrol:1
		}
    };
    
    if(formData.name == null || formData.username == null || formData.email || formData.password){
			let MensajeA = "!Ocurrio un Error¡";
			let MensajaB = "Tiene un campo vacio, por favor, complete todo el formulario"
			MensajeModal(MensajeA,MensajaB)
	}
    
    fetch(event.target.action, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    }).then(response => {
	
		if(response.ok){
			console.log("Se realizo correctamente")
			let MensajeA = "!Registro Exitoso¡";
			let MensajaB = "Se Registro Correctamente, Redirigiendo a la pagina de Inicio de Sesion"
			MensajeModal(MensajeA,MensajaB)
			setTimeout(()=>{
				window.location.href="/Login";
			},3000)
			
		}else{
			console.log("Hubo un problema al procesar la solicitud", response.statusText)
			let MensajeA = "!Ocurrio un Error¡";
			let MensajaB = "Error en el Proceso de la Solicitud, Comuniquese con el equipo de Desarrollo"
			MensajeModal(MensajeA,MensajaB)
			
		}
	
        
    }).catch(error =>{
		console.error("Ocurrio un errror durante la solicitud", error)
			let MensajeA = "Ocurrio un Error";
			let MensajaB = "Error en el Durante la Solicitud, Comuniquese con el equipo de Desarrollo"
			MensajeModal(MensajeA,MensajaB)
	});
}


function mostrarModal(){
	$('#modal').modal('Show')
}

function MensajeModal(MenA, MenB){
			const modal = document.getElementById('modal-tittle');
			modal.textContent = MenA;
			console.log(MenA)
			const modaltext = document.getElementById("text-modal");
			console.log(MenB)
			modaltext.textContent=MenB
}