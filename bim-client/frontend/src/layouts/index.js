import React from 'react';
import styles from './index.css';
import withRouter from 'umi/withRouter';
import Logged from './logged/Logged';
import Login from './login/Login';

function Layout({ children, location }) {
  console.log(location.pathname);
  let Container = location.pathname.indexOf('/login') < 0 ? Logged : Login;

  return (
    <div className={styles.normal}>
      <Container children={children} location={location}/>
    </div>
  );
}

export default withRouter(Layout);
