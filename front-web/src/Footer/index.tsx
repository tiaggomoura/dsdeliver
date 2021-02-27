import "./styles.css";
import {ReactComponent as InstaLogo} from './instagram.svg'
import {ReactComponent as TubeLogo} from './youtube.svg'
import {ReactComponent as LinkLogo} from './linkedin.svg'

function Footer() {
  return (
    <footer className="main-footer">
      App desenvolvido para fins de estudo - SDS-2
      <div className="footer-icons">
        <a href="#" target="_new">
          <TubeLogo/>
        </a>
        <a href="https://www.linkedin.com/in/tiaggomoura/" target="_new">
          <LinkLogo/>
        </a>
        <a href="https://www.instagram.com/tiaggomoura/" target="_new">
          <InstaLogo/>
        </a>
      </div>
    </footer>
  )
}

export default Footer;
