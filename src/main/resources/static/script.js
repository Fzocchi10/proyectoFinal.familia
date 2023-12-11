function realizarSolicitud(){
	axios.get("/familia/integrantes/listar")
		.then(response => {console.log(response.data);
		})
		.catch(error => {
			console.error("No se pudo obtener la lista:", error);
		})
}


async function agregarCriminal(){
	var id = document.getElementById("idAC").value;
	var nombre = document.getElementById("nombreAC").value;
	var puntos = document.getElementById("puntosAC").value;
	var armas = document.getElementById("armasAC").value;
	
	var criminalData = {
		"id": id,
		"nombre": nombre,
		"puntosDeHonor": puntos,
		"armas": [{"tipo": armas}]
	}
	var jsonData = JSON.stringify(criminalData);
	
	await axios.post("/familia/integrantes/agregarCriminal", jsonData)
		.then(response => {console.log(response.data);
		})
		.catch(error => {
			console.error("No se pudo obtener la lista:", error);
		})
}

async function agregarRespetable(){
	
	var id = document.getElementById("idAR").value;
	var nombre = document.getElementById("nombreAR").value;
	var puntos = document.getElementById("puntosAR").value;
	var titulos = document.getElementById("titulosAR").value;
	var cargoPolitico = document.getElementById("cargosAR").checked;
	
	var respetableData = {
		"nombre": nombre,
		"puntosDeHonor": puntos,
		"id": id,
		"titulos": [{"descripcion" : titulos}],
		"cargoPolitico": cargoPolitico
	}
	 jsonData = JSON.stringify(respetableData);
	
	await axios.post("/familia/integrantes/agregarRespetable", jsonData)
		.then(response => {console.log(response.data);
		})
		.catch(error => {
			console.error("No se pudo obtener la lista:", error);
		})
}

async function modificarCriminal(){
	var id = document.getElementById("idMC").value;
	var nombre = document.getElementById("nombreMC").value;
	var puntos = document.getElementById("puntosMC").value;
	var armas = document.getElementById("armasMC").value;
	
	var criminalData = {
		"id": id,
		"nombre": nombre,
		"puntosDeHonor": puntos,
		"armas": [{"tipo": armas}]
	}
	var jsonData = JSON.stringify(criminalData);
	
	await axios.put("/familia/integrantes/modificarCriminal", jsonData)
		.then(response => {console.log(response.data);
		})
		.catch(error => {
			console.error("No se pudo obtener la lista:", error);
		})
}

async function modificarRespetable(){
	var id = document.getElementById("idMR").value;
	var nombre = document.getElementById("nombreMR").value;
	var puntos = document.getElementById("puntosMR").value;
	var titulos = document.getElementById("titulosMR").value;
	var cargoPolitico = document.getElementById("cargosMR").checked;
	
	var respetableData = {
		"nombre": nombre,
		"puntosDeHonor": puntos,
		"id": id,
		"titulos": [{"descripcion" : titulos}],
		"cargoPolitico": cargoPolitico
	}
	 jsonData = JSON.stringify(respetableData);
	
	await axios.put("/familia/integrantes/modificarRespetable", jsonData)
		.then(response => {console.log(response.data);
		})
		.catch(error => {
			console.error("No se pudo obtener la lista:", error);
		})
}

function eliminarIntegrante() {
	
			const idIntegrante = document.getElementById("idE").value;
            axios.delete(`/familia/integrantes/eliminarIntegrante/${idIntegrante}`)
                .then(response => {
                    console.log(response.data);
                    console.log("Se logro eliminar el integrante respetable");
                    window.location.reload(); 
                })
                .catch(error => {
                    console.error("Error al eliminar el integrante:", error);
                    alert("Error al eliminar el integrante. Por favor, intentalo de nuevo.");
                });
        }
  