import React from "react";
import ListofPlayers from "./components/ListOfPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const flag = true; // change to false to show IndianPlayers instead

  return (
    <div className="App">
      <h1>Cricket App</h1>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
