import React from 'react';
import FlightList from './FlightList';

function UserPage() {
  return (
    <div>
      <h2>Welcome User!</h2>
      <p>You can book flights below:</p>
      <FlightList canBook={true} />
    </div>
  );
}

export default UserPage;
