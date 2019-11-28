import request from '../../../utils/request';

export function login({ values }) {
  debugger
  return request('/api/login', {
    method: 'POST',
    body: JSON.stringify(values),
  });
}
