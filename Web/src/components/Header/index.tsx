import { Link } from "react-router-dom";

export default function Header() {

return (
<header className="header">
    <div className="header-container m-0 p-0 w-full h-25 flex items-center justify-between px-6">
      
      <Link 
      to="/"
        className="flex items-center scale-100 sm:scale-110 lg:scale-125"
      >
        <img 
          src="../../../public/MainIcon.png" 
          alt="Logo HC Fácil" 
          className="h-12 w-auto sm:h-16 lg:h-20 mt-2 invert-88"
        />
      </Link>

      <div className="flex flex-row gap-3 sm:gap-5 items-center">
        
        <Link
        to="/"
          className="buttons">
          Home
        </Link>

        <Link
        to="about"
          className="buttons">
          About
        </Link>

        <Link 
        to="Cart"
        className="h-10 w-10 sm:h-10 lg:h-10 invert hover:bg-gray-700 hover:scale-110 hover:invert transition duration-300 rounded-2xl">
            <img src="../../../public/Basket.png" alt="Cart" />
        </Link>

      </div>
    </div>
  </header>
)
}