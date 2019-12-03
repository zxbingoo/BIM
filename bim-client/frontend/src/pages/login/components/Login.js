import { connect } from 'dva';
import styles from './Login.css';
import LoginForm from './LoginForm';
import { message } from 'antd';
import { routerRedux } from 'dva/router';

function Login({dispatch}) {
  function login(values) {
    dispatch({
      type: 'sysLogin/login',
      payload: { values },
    }).then(result => {
      if(result.code == 0){
        message.info("登陆成功");
        dispatch(routerRedux.push({
          pathname: '/',
        }));
      }else {
        message.error(result.info);
      }
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
  const {  } = state.sysLogin;
  return {
    // loading: state.loading.models.login,//对应models里的namespace
  };
}

export default connect(mapStateToProps)(Login);
