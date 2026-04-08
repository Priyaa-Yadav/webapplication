$(document).ready(function () {
    $("#example").DataTable();
    $(".edit").click(function () {
        alert("okk");
        var name = $(this).closest('tr').find('.td1').text();
        var fname = $(this).closest('tr').find('.td1').next().text();
        var mname = $(this).closest('tr').find('.td1').next().next().text();
        var tclass = $(this).closest('tr').find('.td1').next().next().next().text();
        var adhar = $(this).closest('tr').find('.td1').next().next().next().next().text();
        var address = $(this).closest('tr').find('.td1').next().next().next().next().next().next().text();
        var fees = $(this).closest('tr').find('.td1').next().next().next().next().next().next().next().text();
        //alert(name + fname + mname + tclass + address + fees);
        $("#name").val(name); $("#fname").val(fname); $("#mname").val(mname); $("#txtclass").val(tclass); $("#address").val(address); $("#fees").val(fees); $("#adhar").val(adhar)
    })
})