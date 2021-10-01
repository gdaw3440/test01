let main={

    init:function() {
        let _this=this;
        $('#btn-view').on('click', function() {
            _this.view();
        })
    },
    view : function() {
        let data = {
            category:$('#category').val(),
            list:$('#product').val()
        };
        $.ajax({
            type: 'GET',
            url:'/api/'+data.category+'/item/'+data.list,
            dataType:'json',
            contentType:'application/json; charset=utf-8',
            data:JSON.stringify(data)
        }).done(function(res) {
            alert(JSON.stringify(res));
        }).fail(function (error) {
            alert('검색이 실패하였습니다.');
        });
    }
};
main.init();