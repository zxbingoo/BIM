import * as loginService from '../services/Login';

export default {
  namespace: 'login',
  state: {
    list: [],
    total: null,
    page: null,
  },
  //用于对state作格式化，并返回
  reducers: {
    save(state, { payload: {  } }) {
      return { ...state };
    },
  },
  // effects 用于和后台交互，是处理异步数据逻辑的地方。
  // 无法在 effect 中直接修改 state，可以通过 put 方法 调用 reducer 来修改 state 。
  effects: {
    *login({ payload: { values } }, { call }) {
      debugger
      const { data } = yield call(loginService.login, { values });
    },
  },
  // subscriptions 订阅监听，比如监听路由，进入页面如何如何，就可以在这里处理。相当于原生React中的componentWillMount方法
  subscriptions: {
    setup({ dispatch, history }) {
      return history.listen(({ pathname, query }) => {
      });
    },
  },
};
