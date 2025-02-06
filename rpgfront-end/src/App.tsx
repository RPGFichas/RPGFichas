// import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";

import "./styles/style.css";
import Navbar from "./components/Navbar";

function App() {
  return (
    // <div className="parent">
    // <Router>
    //   <ul className="menu">
    //     <li>
    //       <Link to='/'>Home</Link>
    //     </li>
    //     <li>
    //       <Link to='/contatos'>Contatos</Link>
    //     </li>
    //     <li>
    //       <Link to='/sobre'>Sobre</Link>
    //     </li>
    //   </ul>
    //   <Routes>
    //     <Route path="/" element={<Home />} />
    //     <Route path="/contatos" element={<Contatos />} />
    //     <Route path="/sobre" element={<Sobre />} />
    //   </Routes>
    // </Router>
    <div>
      <Navbar/>
    </div>

    // </div>
  );
}

export default App;
