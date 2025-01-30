import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from "./pages/Home";
import Contatos from "./pages/Contatos";
import Sobre from "./pages/Sobre";
import "./styles/style.css";

function App() {
  return (
    <div className="parent">
    <Router>
      <ul className="menu">
        <li>
          <Link to='/'>Home</Link>
        </li>
        <li>
          <Link to='/contatos'>Contatos</Link>
        </li>
        <li>
          <Link to='/sobre'>Sobre</Link>
        </li>
      </ul>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/contatos" element={<Contatos />} />
        <Route path="/sobre" element={<Sobre />} />
      </Routes>
    </Router>
    </div>
  );
}

export default App;
