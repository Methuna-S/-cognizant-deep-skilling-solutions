
import React, { useState } from "react";

function App() {
  const [counter, setCounter] = useState(0);
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  // 1. Handle increment + say hello
  const handleIncrement = () => {
    incrementValue();
    sayHello();
  };

  const incrementValue = () => {
    setCounter((prev) => prev + 1);
    alert("Hello, Member!");
  };

  const sayHello = () => {
    console.log("Hello! Counter has been incremented.");
  };

  const handleDecrement = () => {
    setCounter((prev) => prev - 1);
  };

  // 2. Say Welcome function
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // 3. Synthetic event
  const handlePress = () => {
    alert("I was clicked");
  };

  // 4. Currency Conversion
  const handleSubmit = (e) => {
    e.preventDefault();
    const inr = parseFloat(rupees);
    const euro = (inr / 89.5).toFixed(2); 
    setEuros(euro);
    alert(`₹${inr} is €${euro}`);
  };

  return (
    <div style={{ padding: "30px", fontFamily: "Arial" }}>
      <h1>Event Handling Example</h1>

      <h2>Counter: {counter}</h2>
      <button onClick={handleIncrement}>Increment</button>
      <button onClick={handleDecrement} style={{ marginLeft: "10px" }}>
        Decrement
      </button>

      <hr />

      <h2>Say Welcome</h2>
      <button onClick={() => sayWelcome("Welcome!")}>
        Say Welcome
      </button>

      <hr />

      <h2>Synthetic Event</h2>
      <button onClick={handlePress}>Click Me</button>

      <hr />

      <h2> Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>Indian Rupees: </label>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          placeholder="Enter amount in INR"
          required
        />
        <button type="submit" style={{ marginLeft: "10px" }}>
          Convert to Euro
        </button>
      </form>

      {euros && (
        <p>
          <strong>€{euros}</strong>
        </p>
      )}
    </div>
  );
}

export default App;
