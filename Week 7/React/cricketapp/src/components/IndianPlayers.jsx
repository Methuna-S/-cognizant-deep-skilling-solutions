// import React from "react";

// const IndianPlayers = () => {
//   const oddPlayers = ["Virat", "Rahul", "Hardik", "Shami", "Pant"];
//   const evenPlayers = ["Rohit", "Gill", "Jadeja", "Bumrah", "Ashwin", "Surya"];

//   const [odd1, odd2, odd3, odd4, odd5] = oddPlayers;
//   const [even1, even2, even3, even4, even5, even6] = evenPlayers;

//   const T20Players = ["Virat", "Rohit", "Gill"];
//   const RanjiPlayers = ["Pujara", "Rahane"];

//   const allIndianPlayers = [...T20Players, ...RanjiPlayers]; // Merged

//   return (
//     <div>
//       <h2>Odd Team Players</h2>
//       <ul>
//         <li>{odd1}</li>
//         <li>{odd2}</li>
//         <li>{odd3}</li>
//         <li>{odd4}</li>
//         <li>{odd5}</li>
//       </ul>

//       <h2>Even Team Players</h2>
//       <ul>
//         <li>{even1}</li>
//         <li>{even2}</li>
//         <li>{even3}</li>
//         <li>{even4}</li>
//         <li>{even5}</li>
//         <li>{even6}</li>
//       </ul>

//       <h2>All Indian Players (Merged T20 + Ranji)</h2>
//       <ul>
//         {allIndianPlayers.map((player, i) => (
//           <li key={i}>{player}</li>
//         ))}
//       </ul>
//     </div>
//   );
// };

// export default IndianPlayers;
import React from "react";

// Helper to convert index to ordinal label
const getOrdinal = (index) => {
  const ordinals = [
    "first", "second", "third", "fourth", "fifth", "sixth",
    "seventh", "eighth", "ninth", "tenth", "eleventh"
  ];
  return ordinals[index] || `${index + 1}th`;
};

const IndianPlayers = () => {
  const t20Players = ["Virat", "Rohit", "Surya"];
  const ranjiPlayers = ["Rahul", "Jadeja", "Ashwin"];

  // Merge both arrays
  const allPlayers = [...t20Players, ...ranjiPlayers];

  // Separate into odd and even indexed players
  const oddPlayers = allPlayers.filter((_, index) => index % 2 === 0);
  const evenPlayers = allPlayers.filter((_, index) => index % 2 !== 0);

  return (
    <div>

      <h2>Odd Team Players</h2>
      {oddPlayers.map((player, i) => {
        const originalIndex = i * 2; // gets original index
        return (
          <div key={`odd-${i}`}>
            <li>{getOrdinal(originalIndex)} : {player}</li>
          </div>
        );
      })}

      <h2>Even Team Players</h2>
      {evenPlayers.map((player, i) => {
        const originalIndex = i * 2 + 1;
        return (
          <div key={`even-${i}`}>
            <li>{getOrdinal(originalIndex)} : {player}</li>
          </div>
        );
      })}
      <h2>All Indian Players (Merged)</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
