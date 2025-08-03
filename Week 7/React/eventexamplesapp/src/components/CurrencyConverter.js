import React, { useState } from "react";

const CurrencyConverter = () => {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const inr = parseFloat(rupees);
    const converted = (inr / 89.5).toFixed(2); // Example conversion rate
    setEuros(converted);
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>Indian Rupees:</label>
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
        <button type="submit">Convert to Euro</button>
      </form>

      {euros && (
        <p>
          € <strong>{euros}</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConverter;
