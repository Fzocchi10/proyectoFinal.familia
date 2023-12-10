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
		"armas": addArm(armas)
	}
	var jsonData = JSON.stringify(criminalData);
	
	await axios.post("/familia/integrantes/agregarCriminal", jsonData)
		.then(response => {console.log(response.data);
		})
		.catch(error => {
			console.error("No se pudo obtener la lista:", error);
		})
}

function agregarElements(newElement){
	let lista = [];
	lista.push(newElement);
	return lista
}

async function agregarRespetable(){
	
	var id = document.getElementById("idR").value;
	var nombre = document.getElementById("nombreR").value;
	var puntos = document.getElementById("puntos").value;
	var titulos = document.getElementById("titulosR").value;
	var cargoPolitico = document.getElementById("cargosR").checked;
	
	var respetableData = {
		"id": id,
		"nombre": nombre,
		"puntos": puntos,
		"titulos": agregarElements(titulos),
		"cargos": cargoPolitico
	}
	 jsonData = JSON.stringify(respetableData);
	
	await axios.post("/familia/integrantes/agregarRespetable", jsonData)
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
  