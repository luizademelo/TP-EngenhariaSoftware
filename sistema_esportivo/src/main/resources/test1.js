// Define the URL of the REST API you want to request
// Pesquisa o historico de todos os jogos da copa de 2022
// BTW recomendo usar o postman, alguns requests bugam quando usamos aqui n sei pq!
const apiUrl = 'https://livescore-api.com/api-client/competitions/standings.json?competition_id=362&key=2MjfRPVKKEiTpf0a&secret=1SMCT3sxw2SecfNf26uTVqDG5WAubAFd';

// Make a GET request
fetch(apiUrl)
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json(); // Parse the response body as JSON
  })
  .then(data => {
    // Use the data from the response
    console.log(data);
  })
  .catch(error => {
    console.error('There was a problem with the fetch operation:', error);
  });
