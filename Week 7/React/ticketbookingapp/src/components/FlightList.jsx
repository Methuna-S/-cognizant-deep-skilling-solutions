import React from 'react';

const flights = [
  { id: 1, from: 'Delhi', to: 'Mumbai', price: 5500 },
  { id: 2, from: 'Chennai', to: 'Bangalore', price: 3200 },
  { id: 3, from: 'Hyderabad', to: 'Kolkata', price: 4700 },
];

function FlightList({ canBook }) {
  return (
    <div>
      <h3>Available Flights</h3>
      <ul style={{ listStyleType: 'none' }}>
        {flights.map((flight) => (
          <li key={flight.id} style={{ marginBottom: '15px' }}>
             {flight.from} → {flight.to} — ₹{flight.price}
            {canBook && (
              <button
                style={{ marginLeft: '10px' }}
                onClick={() => alert(`Ticket booked from ${flight.from} to ${flight.to}`)}
              >
                Book
              </button>
            )}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default FlightList;
