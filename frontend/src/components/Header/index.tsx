import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
    return(
      <>
     <header>
        <div className="dsmeta-logo-container">
            <img src={logo} alt="DSMeta" />
            <h1>Relatório de vendas</h1>
            <p>
              Desenvolvido por
              <a href="https://github.com/luccassantos4"> @luccassantos4</a>
            </p>
        </div>
    </header>
      </>
    )
  }
  
  export default Header;