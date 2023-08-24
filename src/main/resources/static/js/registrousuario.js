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
    
    fetch(event.target.action, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(formData)
    }).then(response => {
	
		if(response.ok){
			console.log("Se realizo correctamente")
		}else{
			console.log("Hubo un problema al procesar la solicitud", response.statusText)
			
		}
	
        
    }).catch(error =>{
		console.error("Ocurrio un errro durante la solicitud", error)
	});
}