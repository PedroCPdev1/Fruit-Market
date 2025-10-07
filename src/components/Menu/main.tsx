import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import { BrowserRouter, Routes, Route } from "react-router-dom";
import '../../../globals.css'

import Header from "../Header/index"
import Footer from '../Footer/index';
import Home from "../../routes/Home/Home"
import About from '../../routes/About/index';
import Cart from '../../routes/Cart/index';
import Buy from '../../routes/Buy/index';

createRoot(document.getElementById('root')!).render(
  <StrictMode>
     <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path='/cart' element={<Cart />} />
        <Route path='/about' element={<About />} />
        <Route path='/buy' element={<Buy />} />
      </Routes>
      <Footer />
    </BrowserRouter>
  </StrictMode>
)
