import Header from './Header';
import React from 'react';
import styles from '../index.css';
import withRouter from 'umi/withRouter';

function Logged({ children, location }) {
  return (
    <div className={styles.normal}>
      <Header location={location} />
      <div className={styles.content}>
        <div className={styles.main}>
          {children}
        </div>
      </div>
    </div>
  );
}

export default withRouter(Logged);
