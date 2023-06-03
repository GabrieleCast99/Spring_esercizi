import React, { useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  const fetchApi = async () => {
    console.log("You have clicked the button!");
    try {
      const response = await fetch("http://localhost:8080/custom");
      const text = await response.text();
      console.log("Response: ", text);
      setMessage(text);
    } catch (e) {
      console.error("Error: ", e);
    }
  };

  return (
    <div>
      <h1>React Client Application</h1>
      <button onClick={fetchApi}>Click me</button>
      <p>{message}</p>
    </div>
  );
}

export default App;



