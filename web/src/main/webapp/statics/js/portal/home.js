var $table = $('#table'), selections = [];

function initTable() {
	$table.bootstrapTable({
		height : getHeight(),
		columns : [[{
							title : '序号',
							field : 'tradeId',
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
							field : 'itemName',
							title : '商品信息',
							align : 'center'
						}, {
							field : 'sellerName',
							title : '卖家信息',
							align : 'center'
						}, {
							field : 'tradeNo',
							title : '交易单号',
							sortable : true,
							align : 'center',
							formatter : function(value, row, index) {
								if (value == undefined) {
									return "";
								} else {
									return value;
								}
							},
							editable : {
								type : 'text',
								title : '交易单号',
								validate : function(value) {
									return '';
								},
								url : function(params) {
									var d = new $.Deferred;
									$.ajax({
												type : "post",
												url : appUrl
														+ "/trade/tradeNo.htm",
												data : {
													tradeId : params.pk,
													tradeNo : params.value,
													dateTime : new Date()
															.getTime()
												},
												success : function(data) {
													d.resolve();
												},
												error : function(data) {
													d.reject(data);
												}
											});
									return d.promise();
								}
							}
						}, {
							field : 'tradeDate',
							title : '交易时间',
							sortable : true,
							align : 'center',
							formatter : function(value, row, index) {
								if (value == undefined) {
									return "";
								} else {
									return value;
								}
							},
							editable : {
								type : 'text',
								title : '交易时间',
								validate : function(value) {
									return '';
								},
								url : function(params) {
									var d = new $.Deferred;
									$.ajax({
												type : "post",
												url : appUrl
														+ "/trade/tradeDate.htm",
												data : {
													tradeId : params.pk,
													tradeDate : params.value,
													dateTime : new Date()
															.getTime()
												},
												success : function(data) {
													d.resolve();
												},
												error : function(data) {
													d.reject(data);
												}
											});
									return d.promise();
								}
							}
						}, {
							field : 'like',
							title : '评价',
							align : 'center'
						}, {
							field : 'likeDate',
							title : '评价时间',
							align : 'center'
						}]]
	});

	// sometimes footer render error.
	setTimeout(function() {
				$table.bootstrapTable('resetView');
			}, 200);

	$(window).resize(function() {
				$table.bootstrapTable('resetView', {
							height : getHeight()
						});
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

function getHeight() {
	return $(window).height() - $('h1').outerHeight(true) - 70;
}

$(function() {
			initTable();
		});
