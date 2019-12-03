import request from '../../../utils/request';

export function login({ values }) {
  return request.post('/api/login', values);
}
