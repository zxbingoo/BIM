import { Component } from 'react';
import { Button, Form, Input } from 'antd';
import styles from './Login.css';

const FormItem = Form.Item;

class LoginForm extends Component {

  constructor(props) {
    super(props);
    this.state = {
    };
  }

  login = () => {
    const { login } = this.props;
    this.props.form.validateFields((err, values) => {
      if (!err) {
        login(values);
      }
    });
  };

  render() {
    const { getFieldDecorator } = this.props.form;
    const formItemLayout = {
      labelCol: { span: 10 },
      wrapperCol: { span: 4 },
    };

    return (
      <div className={styles.all}>
        <span>
          <Form horizontal onSubmit={this.okHandler}>
            <FormItem
              {...formItemLayout}
              label="Username"
            >
              {
                getFieldDecorator('username', {
                  initialValue: "",
                })(<Input placeholder="Username"/>)
              }
            </FormItem>
            <FormItem
              {...formItemLayout}
              label="Password"
            >
              {
                getFieldDecorator('password', {
                  initialValue: "",
                })(<Input placeholder="Password"  className={styles.input}/>)
              }
            </FormItem>
          </Form>
      </span>
        <Button type="primary" onClick={this.login}>登陆</Button>
      </div>
    );
  }
}

export default Form.create()(LoginForm);
