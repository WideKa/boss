var $table = $('#table'), $remove = $('#remove'), selections = [];

function initTable() {
	$table.bootstrapTable({
		height : getHeight(),
		columns : [[{
							title : '序号',
							field : 'id',
							rowspan : 2,
							align : 'center',
							valign : 'middle',
							sortable : true
						}, {
							title : '商品信息',
							colspan : 2,
							align : 'center'
						}, {
							title : '交易信息',
							colspan : 2,
							align : 'center'
						}, {
							title : '买家信息',
							colspan : 2,
							align : 'center'
						}], [{
							field : 'name',
							title : '商品信息',
							align : 'center'
						}, {
							field : 'price',
							title : '卖家信息',
							align : 'center'
						}, {
							field : 'name',
							title : '交易单号',
							sortable : true,
							align : 'center',
							editable : {
								type : 'text',
								title : 'Item Price',
								validate : function(value) {
									value = $.trim(value);
									if (!value) {
										return 'This field is required';
									}
									if (!/^$/.test(value)) {
										return 'This field needs to start width $.'
									}
									var data = $table.bootstrapTable('getData'), index = $(this)
											.parents('tr').data('index');
									console.log(data[index]);
									return '';
								}
							}
						}, {
							field : 'name',
							title : '交易时间',
							sortable : true,
							align : 'center',
							editable : {
								type : 'text',
								title : 'Item Price',
								validate : function(value) {
									value = $.trim(value);
									if (!value) {
										return 'This field is required';
									}
									if (!/^$/.test(value)) {
										return 'This field needs to start width $.'
									}
									var data = $table.bootstrapTable('getData'), index = $(this)
											.parents('tr').data('index');
									console.log(data[index]);
									return '';
								}
							}
						}, {
							field : '',
							title : '评价',
							align : 'center'
						}, {
							field : '',
							title : '评价时间',
							align : 'center'
						}]]
	});
	// sometimes footer render error.
	setTimeout(function() {
				$table.bootstrapTable('resetView');
			}, 200);
	$table.on('check.bs.table uncheck.bs.table '
					+ 'check-all.bs.table uncheck-all.bs.table', function() {
				$remove.prop('disabled', !$table
								.bootstrapTable('getSelections').length);

				// save your data, here just save the current page
				selections = getIdSelections();
				// push or splice the selections if you want to save all data
			// selections
		});
	$table.on('expand-row.bs.table', function(e, index, row, $detail) {
				if (index % 2 == 1) {
					$detail.html('Loading from ajax request...');
					$.get('LICENSE', function(res) {
								$detail.html(res.replace(/\n/g, '<br>'));
							});
				}
			});
	$table.on('all.bs.table', function(e, name, args) {
				console.log(name, args);
			});
	$remove.click(function() {
				var ids = getIdSelections();
				$table.bootstrapTable('remove', {
							field : 'id',
							values : ids
						});
				$remove.prop('disabled', true);
			});
	$(window).resize(function() {
				$table.bootstrapTable('resetView', {
							height : getHeight()
						});
			});
}

function getIdSelections() {
	return $.map($table.bootstrapTable('getSelections'), function(row) {
				return row.id
			});
}

function responseHandler(res) {
	$.each(res.rows, function(i, row) {
				row.state = $.inArray(row.id, selections) !== -1;
			});
	return res;
}

function detailFormatter(index, row) {
	var html = [];
	$.each(row, function(key, value) {
				html.push('<p><b>' + key + ':</b> ' + value + '</p>');
			});
	return html.join('');
}

window.operateEvents = {
	'click .like' : function(e, value, row, index) {
		alert('You click like action, row: ' + JSON.stringify(row));
	},
	'click .remove' : function(e, value, row, index) {
		$table.bootstrapTable('remove', {
					field : 'id',
					values : [row.id]
				});
	}
};

function getHeight() {
	return $(window).height() - $('h1').outerHeight(true);
}

$(function() {
			initTable();
		});
