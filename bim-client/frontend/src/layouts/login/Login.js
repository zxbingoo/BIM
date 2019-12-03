import styles from '../index.css';
import withRouter from 'umi/withRouter';
import React from 'react';

function Login({ children }) {
  return (
    <div className={styles.normal}>
      {children}
    </div>
  );
}

export default withRouter(Login);
