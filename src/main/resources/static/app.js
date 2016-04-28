'use strict';

// tag::vars[]
const React = require('react');
const client = require('./client');
// end::vars[]

// tag::app[]
class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {employees: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/book'}).done(response => {
			this.setState({employees: response.entity._embedded.book});
		});
	}

	render() {
		return (
			<EmployeeList employees={this.state.employees}/>
		)
	}
}
// end::app[]

// tag::employee-list[]
class EmployeeList extends React.Component{
	render() {
		var employees = this.props.employees.map(employee =>
			<Employee key={employee._links.self.href} employee={employee}/>
		);
		return (
			<table>
				<tr>
					<th>Name Name</th>
					<th>Last Name</th>
					<th>Description</th>
				</tr>
				{employees}
			</table>
		)
	}
}
// end::employee-list[]

// tag::employee[]
class Employee extends React.Component{
	render() {
	console.log(this.props.employee.author);
		return (
			<tr>
				<td>{this.props.employee.author}</td>
				<td>{this.props.employee.title}</td>
				<td>{this.props.employee.barCode}</td>
			</tr>
//            <BootstrapTable data={ this.props.employee }>
//                <TableHeaderColumn dataField='author' isKey={ true }>Номер</TableHeaderColumn>
//                <TableHeaderColumn dataField='title'>Product Name</TableHeaderColumn>
//                <TableHeaderColumn dataField='barCode'>Product Price</TableHeaderColumn>
//            </BootstrapTable>
		)
	}
}
// end::employee[]

// tag::render[]
React.render(
	<App />,
	document.getElementById('react')
)
// end::render[]

