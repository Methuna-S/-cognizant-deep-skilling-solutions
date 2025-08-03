import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div style={{ textAlign: 'center' }}>
      <h1> Ticket Booking App</h1>
      {isLoggedIn ? (
        <>
          <button onClick={() => setIsLoggedIn(false)}>Logout</button>
          <UserPage />
        </>
      ) : (
        <>
          <button onClick={() => setIsLoggedIn(true)}>Login</button>
          <GuestPage />
        </>
      )}
    </div>
  );
}

export default App;
