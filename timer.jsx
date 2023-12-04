import React, { useState,useEffect } from "react";
import Swal from "sweetalert2";
import './style.css'
import { Button } from "react-bootstrap";
const TimerAssesment = ()=>{
  const [input, setInput] = useState("");
  const [timer, setTimer] = useState(0);
  const [status, setStatus] = useState("stopped");
  useEffect(() => {
    const countdown = () => {
      if (timer === 0) {
        setStatus("stopped");
        setInput(0);
        // alert(`Timer of ${input} seconds completed` )
        Swal.fire({
            title: "Good job!",
            text: `Timer of ${input} seconds completed`,
            icon: "success"
          });
      } else {
        setTimer(timer - 1);
      }
    };
    //Setting up the interval for countdown
    let intervalId
    if (status === "running") {
      intervalId = setInterval(countdown, 1000);
    }
    //clean up the iterval
    return () => clearInterval(intervalId);
  }, [timer, status]); //timer and status as dependencies
  const handleChange = (e) => {
    const value = e.target.value;
    const number = parseInt(value);

    if (!isNaN(number)) {
      setInput(number);
      setTimer(number);
    } else {
        Swal.fire({
            title: "Invalid input",
            text: "Please give valid input",
            icon: "error"
          });
      setInput("");
      setTimer(0);
    }
  };
  const handleStart = () => {  
    setStatus("running");
  };

  const handlePause = () => {
    setStatus("paused");
  };
  const handleReset=(e)=>{
    setInput(input);
    setTimer(input)
    setStatus("stopped")
  }
  return (
    <div className="box">
      <h1>Timer</h1>
      <input
        type="text"
        value={input}
        onChange={handleChange}
      />
      <div className="button">
      {status==="running"?<button onClick={handlePause}>Pause</button> :  <button onClick={handleStart}> Start</button>}
      <button onClick={handleReset}>Reset</button>
      </div>
      <div className="display">
        <h2>{timer}</h2>
      </div>
    </div>
  );
}
export default TimerAssesment;
