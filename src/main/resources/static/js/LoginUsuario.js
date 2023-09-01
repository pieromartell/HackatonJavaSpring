function LoginData(event){
	 event.preventDefault();
	 const formData = {
		
		username : document.getElementById('username').value,
		password : document.getElementById('password').value
		
	};
	
	   fetch(event.target.action, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    }).then(response =>{
		if(response.ok){
			
			const jwtCookie = document.cookie
			.split(';')
			.find(row =>row.startsWith('jwtToken='));
			
			if(jwtCookie){
				const jwt = jwtCookie.split('=')[1];
				console.log(jwt)
				localStorage.setItem("jwtToken",jwt);
			}
			const idrolCookie = document.cookie
                .split(';')
                .find(row => row.trim().startsWith('idrol='));
            
            if (idrolCookie) {
                const idrol = idrolCookie.split('=')[1];
                console.log(idrol);
                localStorage.setItem('idrol', idrol);
            }
			
			console.log("Se realizo correctamente");
			let MensajeA = "Se realizo correctamente";
			let MensajaB
			if(idrolCookie != 1){
				MensajaB = "Bienvenido a la Pagina Principal de Tienda Hackaton"
				
			}else{
				MensajaB = "Bienvenido a la Pagina Principal de Administraccion de la Tienda Hackaton"

			}
			MensajeModal(MensajeA,MensajaB)
		}else{
			console.log("Hubo un problema al procesa la solicitud", response.status)
			let MensajeA = "Ocurrio un Error";
			let MensajaB = "Hay un problema al procesa la solicitud";
			MensajeModal(MensajeA,MensajaB);
		}
	}).catch(error=>{
		console.log("Ocurrio un error durante la solicitud", error)
			let MensajeA = "Ocurrio un Error";
			let MensajaB = "Error durante la solicitud";
			MensajeModal(MensajeA,MensajaB);
	})	
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
