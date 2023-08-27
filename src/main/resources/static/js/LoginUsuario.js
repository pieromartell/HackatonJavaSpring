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
			
			console.log("Se realizo correctamente");
		}else{
			console.log("Hubo un problema al procesa la solicitud", response.status)
		}
	}).catch(error=>{
		console.log("Ocurrio un error durante la solicitud", error)
	})	
}