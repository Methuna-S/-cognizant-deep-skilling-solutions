import React from "react";
// import "./OfficeList.css";

const OfficeList = () => {
  // Office image and single office object
  const officeImage = "https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg";

  const offices = [
    {
      name: "Skyline Towers",
      rent: 55000,
      address: "123 MG Road, Bengaluru",
    },
    {
      name: "TechPark View",
      rent: 72000,
      address: "45 Outer Ring Road, Bengaluru",
    },
    {
      name: "Startup Hub",
      rent: 48000,
      address: "8th Block, Koramangala",
    },
  ];

  return (
    <div>
      <img src={officeImage} alt="Office Space" style={{ width: "400px" }} />

      <h2>Available Office Spaces, at affordable Range</h2>
      <ul>
        {offices.map((office, index) => (
          <li key={index} className="office-card">
            <p><strong>Name:</strong> {office.name}</p>
            <p>
              <strong>Rent:</strong>{" "}
              <span
                style={{
                  color: office.rent < 60000 ? "red" : "green",
                  fontWeight: "bold",
                }}
              >
                ₹{office.rent}
              </span>
            </p>
            <p><strong>Address:</strong> {office.address}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default OfficeList;
