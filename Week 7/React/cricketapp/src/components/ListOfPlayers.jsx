import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 65 },
    { name: "Gill", score: 90 },
    { name: "Rahul", score: 45 },
    { name: "Hardik", score: 72 },
    { name: "Jadeja", score: 40 },
    { name: "Bumrah", score: 95 },
    { name: "Shami", score: 50 },
    { name: "Pant", score: 75 },
    { name: "Ashwin", score: 60 },
    { name: "Surya", score: 88 },
  ];

  // Filter score < 70
  const lowScorers = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of All Players</h2>
      <ul>
        {players.map((player, i) => (
          <li key={i}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players with Score &lt; 70</h2>
      <ul>
        {lowScorers.map((player, i) => (
          <li key={i}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
