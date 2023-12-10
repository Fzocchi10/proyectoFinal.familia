
// Función para realizar la solicitud JSON
    function realizarSolicitud() {
      // URL del endpoint al que deseas hacer la solicitud
      const url = 'http://localhost:8080/familia/integrantes/listar';
	// Realizar la solicitud usando fetch()
      fetch(url)
        .then(response => response.json()) // Convertir la respuesta a JSON
        .then(data => {
          // Manipular los datos recibidos
          console.log(data); // Mostrar los datos en la consola
          // Mostrar los datos en el HTML
          document.getElementById('resultado').innerText = JSON.stringify(data);
        })
        .catch(error => {
          console.error('¡Hubo un error!', error);
        });
    }

   
   
   function agregarCriminal() {
    const formulario = document.getElementById('agregarCriminal');
	const formData = new FormData(formulario);
    const datos = {}
    formData.forEach((value, key) => {
      datos[key] = value;
    });
    const datosJSON = JSON.stringify(datos)
    fetch('http://localhost:8080/familia/integrantes/agregarCriminal', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: datosJSON
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la solicitud');
      }
      return response.json();
    })
    .then(data => {
      console.log('Solicitud POST exitosa:', data);
      // Aquí puedes realizar acciones adicionales después de una respuesta exitosa
    })
    .catch(error => {
      console.error('Error al realizar la solicitud POST:', error);
    });
  }
  
   function modificarCriminal() {
    const formulario = document.getElementById('modificarCriminal');
    const formData = new FormData(formulario);
    const datos = {};
    formData.forEach((value, key) => {
      datos[key] = value;
    });
	
    const datosJSON = JSON.stringify(datos);
	
    fetch('http://localhost:8080/familia/integrantes/modificarCriminal', {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json'
      },
      body: datosJSON
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la solicitud');
      }
      return response.json();
    })
    .then(data => {
      console.log('Solicitud PUT exitosa:', data);
      // Aquí puedes realizar acciones adicionales después de una respuesta exitosa
    })
    .catch(error => {
      console.error('Error al realizar la solicitud PUT:', error);
    });
  }
  
  function agregarRespetable() {
    const formulario = document.getElementById('agregarRespetable');
	const formData = new FormData(formulario);
    const datos = {}
    formData.forEach((value, key) => {
      datos[key] = value;
    });
    const datosJSON = JSON.stringify(datos)
    fetch('http://localhost:8080/familia/integrantes/agregarRespetable', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: datosJSON
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la solicitud');
      }
      return response.json();
    })
    .then(data => {
      console.log('Solicitud POST exitosa:', data);
      // Aquí puedes realizar acciones adicionales después de una respuesta exitosa
    })
    .catch(error => {
      console.error('Error al realizar la solicitud POST:', error);
    });
  }
  
    function modificarRespetable() {
    const formulario = document.getElementById('modificarRespetable');
    const formData = new FormData(formulario);
    const datos = {};
    formData.forEach((value, key) => {
      datos[key] = value;
    });
	
    const datosJSON = JSON.stringify(datos);
	
    fetch('http://localhost:8080/familia/integrantes/modificarRespetable', {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json'
      },
      body: datosJSON
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Error en la solicitud');
      }
      return response.json();
    })
    .then(data => {
      console.log('Solicitud PUT exitosa:', data);
      // Aquí puedes realizar acciones adicionales después de una respuesta exitosa
    })
    .catch(error => {
      console.error('Error al realizar la solicitud PUT:', error);
    });
  }
  