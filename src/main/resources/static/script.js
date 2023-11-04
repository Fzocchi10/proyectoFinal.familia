const formElement = document.getElementById("agregarCriminal");

let id = document.getElementById("idCriminal").value;
let nombre = document.getElementById("nombreCriminal").value;
let puntosDeHonor = document.getElementById("puntoDeHonorCriminal").value;
let armas = document.getElementById("armasCriminal").value;
let agregarCriminal = { 
                        id:id, 
                        nombre:nombre,
                        puntosDeHonor: puntosDeHonor,
                        armas:armas
                    }

let agregarCriminalJson = JSON.stringify(agregarCriminal);
console.log(agregarCriminalJson)