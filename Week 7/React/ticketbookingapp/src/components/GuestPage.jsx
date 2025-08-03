import React from 'react';
import FlightList from './FlightList';

function GuestPage() {
  return (
    <div>
      <h2>Welcome Guest!</h2>
      <p>You can browse the available flights below:</p>
      <FlightList canBook={false} />
    </div>
  );
}

export default GuestPage;
