var viewModel = {};

function ViewModel() {

	var self = this;

	self.member = ko.observableArray([
	{
		name : 'name1',
		number : '1111'
	}, {
		name : 'name2',
		number : '2222'
	} ]
	);
}

$(function() {

	ko.components.register('test', {
		viewModel : function(params) {
			var param = params.name + "の内線番号は" + params.number + "です。";
			this.content = ko.observable(param);
		},
		template : '<span data-bind="text: content, attr: { \'title\' : content }"></span>'
	});

	ko.applyBindings(new ViewModel());
});