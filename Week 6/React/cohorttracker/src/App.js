import React from 'react';
import CohortDetails from './Components/CohortDetails';

function App() {
  const cohorts = [
    { name: 'React Bootcamp', startDate: '2025-01-10', endDate: '2025-04-10', status: 'ongoing' },
    { name: 'Node.js Basics', startDate: '2024-08-01', endDate: '2024-10-01', status: 'completed' },
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
