import { connect } from 'dva';
import styles from './Login.css';
import LoginForm from './LoginForm';

function Login({ dispatch, loading}) {
  function login(values) {
    dispatch({
      type: '/login/login',
      payload: { values },
    });
  }

  return (
    <div className={styles.normal}>
      <div>
        <LoginForm login={login.bind(null)}/>
      </div>
    </div>
  );
}

function mapStateToProps(state) {
  const {  } = state.login;
  return {
    // loading: state.loading.models.login,//对应models里的namespace
  };
}

export default connect(mapStateToProps)(Login);
