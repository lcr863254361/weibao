<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2020/8/26
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="application/msword; charset=gb2312" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    String contextPath = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + contextPath + "/";
%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script type="text/javascript">
    var __ctx = '<%=request.getContextPath()%>';
    var hangduanId = '<%=request.getParameter("hangduanId")%>';
    var taskId = '<%=request.getParameter("taskId")%>';
    if (hangduanId == 'null') {
        hangduanId = '${hangduanId}';
    }
    var isCanEdit = '${isCanEdit}';
    var isSubmitTable = '${isSubmitTable}';
    if (typeof'${homeMapPathList}' != "undefined") {
        var homeMapPathList = eval('${homeMapPathList}');
    }
    if (typeof'${showCarryToolList}' != "undefined") {
        var showCarryToolList = eval('${showCarryToolList}');
    }
    var ss = typeof '${recordRed}';
    if (typeof ss != "undefined") {
        var recordRed = '${recordRed}';
        if (recordRed != '') {
            recordRed = eval('(' + recordRed + ')');
        }
    }
    var basketPicFileId = '${basketPicFileId}';
</script>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title></title>
    <script type="text/javascript" src="${ctx}/app/javascript/lib/jquery/jquery-1.7.2.min.js"></script>
    <link rel="stylesheet" href="${ctx}/app/javascript/lib/layui-2.5.5/src/css/layui.css">
    <script type="text/javascript"
            src="${ctx}/app/javascript/orientjs/extjs/TaskPrepareMgr/Accounting/js/viewRowOperation.js"></script>
    <script type="text/javascript"
            src="${ctx}/app/javascript/orientjs/extjs/TaskPrepareMgr/Accounting/js/FileSaver.js"></script>
    <script type="text/javascript"
            src="${ctx}/app/javascript/orientjs/extjs/TaskPrepareMgr/Accounting/js/jquery.wordexport.js"></script>
    <style type="text/css">
        td {
            height: 25px;
            width: auto;
        }

        body {
            text-align: center;
        }

        /*??????input ??????number??????????????????????????????????????? */
        .deal::-webkit-outer-spin-button {
            -webkit-appearance: none;
        }

        .deal::-webkit-inner-spin-button {
            -webkit-appearance: none;
        }
    </style>
</head>
<body>
<div id="divingPlanWord">
    <form action="" method="" name="formTable1" class="layui-form" autocomplete="off">
        <!--<div id="planTable1">-->
        <table height="" border="1" align="center" width="80%" cellspacing=0 cellpadding=0>
            <tr>
                <td align="center" valign="middle" colspan="4">????????????????????????????????????????????????????????????</td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????</td>
                <td>${numberContent}</td>
                <td align="center" valign="middle">????????????</td>
                <td>${divingDate}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????????????????</td>
                <td>${positionTime}</td>
                <td align="center" valign="middle">????????????????????????</td>
                <td>${planFloatToWTime}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????????????????</td>
                <td id="planWaterTime" name="planWaterTime">${planWaterTime}</td>
                <td align="center" valign="middle">??????????????????</td>
                <td>${palnThrowTime}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????????????????(min)</td>
                <td name="planFloatTime">${planFloatTime}</td>
                <td align="center" valign="middle" name='divingType' id="divingType">????????????</td>
                <td maxlength="10">${divingType}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????(??)<br>(+????????? -?????????)</td>
                <td id="longtitude">${longtitude}</td>
                <td align="center" valign="middle">??????(??)<br>(+????????? -?????????)</td>
                <td id="latitude">${latitude}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????</td>
                <%--<td><input name="seaArea" type="text" id="seaArea"--%>
                <%--style="width: 100%;height: 100%;border:none;" value="${seaArea}"></td>--%>
                <td id="seaArea">${seaArea}</td>
                <td align="center" valign="middle">??????????????????(M)</td>
                <td style="width: auto;" id="selectDivingDepth">${planDivingDepth}
                </td>
            </tr>
            <tr>
                <td align="center" valign="middle">??????(Kg/m??)</td>
                <td name="density" id="density">${density}</td>
                <td align="center" valign="middle">??????????????????(M)</td>
                <td style="width: auto;" name="planFloatDepth" id="planFloatDepth">${planFloatDepth}
                </td>
            </tr>
            <tr>
                <td align="center" valign="middle">?????????</td>
                <td colspan="3">
                    ${homeWorkPoint}</td>
            </tr>
            <tr>
                <td align="center" valign="middle" width="">??????</td>
                <td align="center" valign="middle" colspan="2">??????</td>
                <td align="center" valign="middle">??????</td>
            </tr>
            <tr height="20">
                <td align="center" valign="middle" id="selectZuoxian">${selectZuoxian}
                </td>
                <td align="center" valign="middle" colspan="2" id="selectMainDriver">${selectMainDriver}
                </td>
                <td align="center" valign="middle" id="selectYouxian">${selectYouxian}
                </td>
            </tr>
            <tr>
                <td align="center" valign="middle">????????????(Kg)</td>
                <td align="center" valign="middle">${divingLoad}</td>
                <td align="center" valign="middle">????????????(Kg)</td>
                <td align="center" valign="middle">${comeupLoad}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">?????????????????????(L)</td>
                <td align="center" valign="middle">${adjustLoad}</td>
                <td align="center" valign="middle">????????????(Kg)</td>
                <td align="center" valign="middle">${peizhongQk}</td>
            </tr>
            <tr>
                <td align="center" valign="middle">?????????????????????(Kg)</td>
                <td align="center" valign="middle" id="basketWeight" name="basketWeight"></td>
                <td align="center" valign="middle">??????????????????(L)</td>
                <td align="center" valign="middle">${mercury}</td>
            </tr>
            <tr>
                <td colspan="4" style="border: none" style="width: 100%;padding: 0">
                    <table id="cabinCarryTable" height="" border="1" align="center" frame="void" width="100% "
                           cellspacing=0
                           cellpadding=0>
                        <tr id="cabinCombineRow">
                            <td align="center" valign="middle" rowspan="2">???????????????????????????</td>
                            <td align="center" valign="middle">??????</td>
                            <td align="center" valign="middle" colspan="3">???????????????(Kg)</td>
                            <%--<td align="center" valign="middle">????????????(L)</td>--%>
                            <%--<td align="center" valign="middle">???????????????(Kg)</td>--%>
                            <td align="center" valign="middle">??????????????????</td>
                            <td align="center" valign="middle">?????????(Kg)</td>
                            <td align="center" valign="middle" colspan="2">????????????????????????</td>
                            <%--<td align="center" valign="middle">??????</td>--%>
                        </tr>
                        <tr id="cabinRow0" height="20">
                            <td name="cabinSelectorCarryName0" align="center" valign="middle" style="width: auto;"
                                id="cabinSelectorCarryName0">
                            </td>
                            <td align="center" valign="middle" colspan="3" name="cabinAirWeight0" id="cabinAirWeight0">
                                ${cabinAirWeight0}
                            </td>
                            <td align="center" valign="middle" name="cabinPlanCarryCount0"
                                id="cabinPlanCarryCount0"></td>
                            <td id="cabinNetWeight0" name="cabinNetWeight0" align="center" valign="middle"></td>
                            <td align="center" valign="middle" name="cabinConnectWay0" id="cabinConnectWay0" colspan="2">
                                ${cabinConnectWay0}
                            </td>
                            <%--<td style="width:80px">--%>
                                <%--<input type="button" name="delete" value="??????"--%>
                                       <%--style="width: 100%;height: 100%;border:none;"--%>
                                       <%--onclick="deleteCabinInSelectedRow('cabinRow0')"/>--%>
                            <%--</td>--%>
                        </tr>
                        <%--<tr>--%>
                            <%--<td align="center" colspan="10">--%>
                                <%--<br/>--%>
                                <%--<input type="button" name="insert" value="????????????"--%>
                                       <%--style="color: black;font-family: bold;font-size: large;width:100px"--%>
                                       <%--onclick="cabinInsertNewRow('','','',carryParameters)"/>&nbsp&nbsp--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                        <tr>
                            <td align="center" valign="middle">????????????????????????????????????</td>
                            <td></td>
                            <td id="cabinAirAllWeight" colspan="3" align="center" valign="middle"></td>
                            <%--<td id="cabinPWaterAllVolume"></td>--%>
                            <%--<td id="cabinFreshWaterAllVolume"></td>--%>
                            <td></td>
                            <td align="center" valign="middle" id="cabinAllNetWeight"></td>
                            <td colspan="2"></td>
                            <%--<td><input type="button" value=" ?????? "--%>
                                       <%--style="width: 100%;height: 100%;border:none;"--%>
                                       <%--onclick="calCabinTotalAirWeight()"/></td>--%>
                        </tr>
                        <tr></tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td colspan="4" style="border: none" style="width: 100%;padding: 0">
                    <table id="specialTable" height="" border="1" align="center" frame="void" width="100% "
                           cellspacing=0
                           cellpadding=0>
                        <!--<div id="specialTableDiv">-->
                        <tr id="combineRow">
                            <td align="center" valign="middle" rowspan="2">???????????????????????????</td>
                            <td align="center" valign="middle">??????</td>
                            <td align="center" valign="middle">???????????????(Kg)</td>
                            <td align="center" valign="middle">????????????(L)</td>
                            <td align="center" valign="middle">???????????????(Kg)</td>
                            <td align="center" valign="middle">??????????????????</td>
                            <td align="center" valign="middle">?????????(Kg)</td>
                            <td align="center" valign="middle" colspan="2">????????????????????????</td>
                            <%--<td align="center" valign="middle">??????</td>--%>
                        </tr>
                        <tr id="row0" height="20">
                            <td id="selectorCarryName0" name="selectorCarryName0" align="center" valign="middle"
                                style="width: auto;">
                            </td>
                            <td align="center" valign="middle" name="airWeight0" id="airWeight0">
                                ${airWeight0}
                            </td>
                            <td align="center" valign="middle" name="pWaterVolume0" id="pWaterVolume0">
                                ${pWaterVolume0}
                            </td>
                            <td align="center" valign="middle" name="freshWaterVolume0" id="freshWaterVolume0">
                                ${freshWaterVolume0}</td>
                            <td align="center" valign="middle" name="planCarryCount0"
                                id="planCarryCount0">${planCarryCount0}</td>
                            <td id="netWeight0" name="netWeight0" align="center" valign="middle"></td>
                            <td align="center" valign="middle" name="connectWay0" id="connectWay0" colspan="2">
                                ${connectWay0}
                            </td>
                            <%--<td style="width:80px">--%>
                                <%--<input type="button" name="delete" value="??????"--%>
                                       <%--style="width: 100%;height: 100%;border:none;"--%>
                                       <%--onclick="deleteSelectedRow('row0')"/>--%>
                            <%--</td>--%>
                        </tr>
                        <%--<tr>--%>
                            <%--<td align="center" colspan="9">--%>
                                <%--<br/>--%>
                                <%--<input type="button" name="insert" value="????????????"--%>
                                       <%--style="color: black;font-family: bold;font-size: large;width:100px"--%>
                                       <%--onclick="insertNewRow('','','',carryParameters)"/>&nbsp&nbsp--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                        <!--</div>-->
                        <tr>
                            <td align="center" valign="middle">????????????????????????????????????</td>
                            <td></td>
                            <td id="airAllWeight" align="center" valign="middle"></td>
                            <td id="pWaterAllVolume" align="center" valign="middle"></td>
                            <td id="freshWaterAllVolume" align="center" valign="middle"></td>
                            <td></td>
                            <td align="center" valign="middle" id="allNetWeight"></td>
                            <td colspan="2"></td>
                            <%--<td><input type="button" value=" ?????? "--%>
                                       <%--style="width: 100%;height: 100%;border:none;"--%>
                                       <%--onclick="caltotalAirWeight()"/></td>--%>
                        </tr>
                        <tr>
                            <td align="center" valign="middle">????????????</td>
                            <td colspan="8"
                                style="width:100px;height:100px;" id="mainTask" name="mainTask">
                                ${mainTask}</td>
                        </tr>
                        <tr>
                            <td align="center" valign="middle">????????????</td>
                            <td  colspan="8"
                                style="width:100px;height:100px;" id="workProgress" name="workProgress">
                                ${workProgress}</td>
                        </tr>
                        <tr>
                            <td align="center" valign="middle">????????????</td>
                            <td  colspan="8"
                                style="width:100px;height:100px;" id="attention" name="attention">
                                ${attention}</td>
                        </tr>
                        <tr>
                            <td align="center" valign="middle">????????????</td>
                            <td id="picDetails" colspan="8">
                            </td>
                        </tr>
                        <tr>
                            <td align="center" valign="middle">?????????????????????</td>
                            <td id="basketPicDetail" colspan="8">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <p id="buttonGroup" style=" margin:0 auto; text-align:center;"><input type="button"
                                                                              id="exportDivingPlanWord" value="??????word"
                                                                              style="color: black;font-family: bold;font-size: large"
                                                                              class="layui-btn layui-btn-primary"/></p>
        <!--</div>-->
    </form>
</div>
<script src="${ctx}/app/javascript/lib/layui-2.5.5/src/layui.js" charset="utf-8"></script>
<script>
    if (typeof jQuery !== "undefined" && typeof saveAs !== "undefined") {
        (function($) {
            $.fn.wordExport = function(fileName) {
                fileName = typeof fileName !== 'undefined' ? fileName : "jQuery-Word-Export";
                var static = {
                    mhtml: {
                        top: "Mime-Version: 1.0\nContent-Base: " + location.href + "\nContent-Type: Multipart/related; boundary=\"NEXT.ITEM-BOUNDARY\";type=\"text/html\"\n\n--NEXT.ITEM-BOUNDARY\nContent-Type: text/html; charset=\"utf-8\"\nContent-Location: " + location.href + "\n\n<!DOCTYPE html>\n<html>\n_html_</html>",
                        head: "<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n<style>\n_styles_\n</style>\n</head>\n",
                        body: "<body>_body_</body>"
                    }
                };
                var options = {
                    maxWidth: 624
                };
                // Clone selected element before manipulating it
                var markup = $(this).clone();

                // Remove hidden elements from the output
                markup.each(function() {
                    var self = $(this);
                    if (self.is(':hidden'))
                        self.remove();
                });

                // Embed all images using Data URLs
                var images = Array();
                var img = markup.find('img');
                for (var i = 0; i < img.length; i++) {
                    // Calculate dimensions of output image
                    var w = Math.min(img[i].width, options.maxWidth);
                    var h = img[i].height * (w / img[i].width);
                    // Create canvas for converting image to data URL
                    var canvas = document.createElement("CANVAS");
                    canvas.width = w;
                    canvas.height = h;
                    // Draw image to canvas
                    var context = canvas.getContext('2d');
                    context.drawImage(img[i], 0, 0, w, h);
                    // Get data URL encoding of image
                    var uri = canvas.toDataURL("image/png");
                    $(img[i]).attr("src", img[i].src);
                    img[i].width = w;
                    img[i].height = h;
                    // Save encoded image to array
                    images[i] = {
                        type: uri.substring(uri.indexOf(":") + 1, uri.indexOf(";")),
                        encoding: uri.substring(uri.indexOf(";") + 1, uri.indexOf(",")),
                        location: $(img[i]).attr("src"),
                        data: uri.substring(uri.indexOf(",") + 1)
                    };
                }

                // Prepare bottom of mhtml file with image data
                var mhtmlBottom = "\n";
                for (var i = 0; i < images.length; i++) {
                    mhtmlBottom += "--NEXT.ITEM-BOUNDARY\n";
                    mhtmlBottom += "Content-Location: " + images[i].location + "\n";
                    mhtmlBottom += "Content-Type: " + images[i].type + "\n";
                    mhtmlBottom += "Content-Transfer-Encoding: " + images[i].encoding + "\n\n";
                    mhtmlBottom += images[i].data + "\n\n";
                }
                mhtmlBottom += "--NEXT.ITEM-BOUNDARY--";

                //TODO: load css from included stylesheet
                var styles = "";

                // Aggregate parts of the file together
                var fileContent = static.mhtml.top.replace("_html_", static.mhtml.head.replace("_styles_", styles) + static.mhtml.body.replace("_body_", markup.html())) + mhtmlBottom;

                // Create a Blob with the file contents
                var blob = new Blob([fileContent], {
                    type: "application/msword;charset=utf-8"
                });
                saveAs(blob, fileName + ".doc");
            };
        })(jQuery);
    } else {
        if (typeof jQuery === "undefined") {
            console.error("jQuery Word Export: missing dependency (jQuery)");
        }
        if (typeof saveAs === "undefined") {
            console.error("jQuery Word Export: missing dependency (FileSaver.js)");
        }
    }

    if (typeof homeMapPathList != "undefined") {
        if (homeMapPathList.length > 0) {
            (function () {
                for (var i = 0; i < homeMapPathList.length; i++) {
                    $("#picDetails").append([
                        '<a id="example-image-link" ' + '" href="' + __ctx + '/orientForm/download.rdm?fileId=' + homeMapPathList[i].fileId + '" data-lightbox="orientImage" data-title="' + homeMapPathList[i].fileName + '">' + homeMapPathList[i].fileName
                        + '&nbsp;&nbsp;',
                        '</a>'
                    ].join(""));
                }
            })()
        }
    }

    // if (typeof homeMapPathList != "undefined") {
    //     if (homeMapPathList.length > 0) {
    //         for (var i = 0; i < homeMapPathList.length; i++) {
    //             $("#picDetails").append([
    //                 '<a class="example-image-link" ' + '" href="' + __ctx + '/orientForm/download.rdm?fileId=' + homeMapPathList[i].fileId + '" data-lightbox="orientImage" data-title="' + homeMapPathList[i].filename + '">',
    //                 '<img  width="100px" height="100px" "id="example-image' + i + '" src="' + __ctx + '/orientForm/download.rdm?fileId=' + homeMapPathList[i].fileId + '"' +
    //                 '" onclick="' + 'javaScript:window.open(\'' + __ctx + '/preview/imageSuoluetu/' + homeMapPathList[i].filePath + '\')' +
    //                 '"></img>' + '&nbsp;&nbsp;',
    //                 '</a>'
    //             ].join(""));
    //         }
    //     }
    // }


    $('#exportDivingPlanWord').click(function (event) {
        let styles=".img{width:50px;height:50px}";
        $("#divingPlanWord").wordExport('????????????????????????????????????????????????????????????',styles);
    });

    if (basketPicFileId != "") {
        var basketPic = typeof '${basketPicMap}';
        if (typeof basketPic != "undefined") {
            var basketPicMap = '${basketPicMap}';
            if (basketPicMap != '') {
                basketPicMap = eval('(' + basketPicMap + ')');
                $("#basketPicDetail").append([
                    '<a class="example-image-link" ' + '" href="' + __ctx + '/orientForm/download.rdm?fileId=' + basketPicMap.fileId + '" data-lightbox="orientImage" data-title="' + basketPicMap.filename + '">',
                    '<img style="width:100px;height:100px;" id="example-image' + '" src="' + __ctx + '/orientForm/download.rdm?fileId=' + basketPicMap.fileId + '"' +
                    // '" onclick="' + 'javaScript:window.open(\'' + __ctx + '/preview/imageSuoluetu/' + basketPicMap.filePath + '\')' +
                    '"></img>' + '&nbsp;&nbsp;',
                    '</a>'
                ].join(""));
            }
        }
    }

    // ????????????????????????
    function caltotalAirWeight() {
        var density = $("#density").text();
        var specialTableRowCount = $("#specialTable tr").length - 7;
        if (specialTableRowCount > 0) {
            var airAllWeight = 0;
            var pWaterAllVolume = 0;
            var freshWaterAllVolume = 0;
            for (var i = 0; i < specialTableRowCount; i++) {
                var airWeight = Number($('#airWeight' + i).text());
                var pWaterVolume = Number($('#pWaterVolume' + i).text());
                var freshWaterVolume = Number($('#freshWaterVolume' + i).text());
                var planCarryCount = Number($('#planCarryCount' + i).text());
                var netWeight = Number((airWeight - (pWaterVolume * 0.001 * density)) * planCarryCount);
                netWeight = (Math.round(netWeight * 10) / (10)).toFixed(1);
                //???????????????
                $("#netWeight" + i).text(netWeight);
                airAllWeight += airWeight * planCarryCount;
                pWaterAllVolume += pWaterVolume * planCarryCount;
                freshWaterAllVolume += freshWaterVolume * planCarryCount;
            }
            airAllWeight = (Math.round(airAllWeight * 10) / (10)).toFixed(1);
            pWaterAllVolume = (Math.round(pWaterAllVolume * 10) / (10)).toFixed(1);
            freshWaterAllVolume = (Math.round(freshWaterAllVolume * 10) / (10)).toFixed(1);
            $('#airAllWeight').text(Number(airAllWeight));
            $('#pWaterAllVolume').text(Number(pWaterAllVolume));
            $('#freshWaterAllVolume').text(Number(freshWaterAllVolume));
            var allNetWeight = Number(Number(airAllWeight) - (Number(pWaterAllVolume) * 0.001 * (Number($("#density").text()))));
            allNetWeight = (Math.round(allNetWeight * 10) / (10)).toFixed(1);

            $('#allNetWeight').text(Number(allNetWeight));
            $('#basketWeight').text(Number(airAllWeight));
        } else {
            $('#airAllWeight').text("");
            $('#pWaterAllVolume').text("");
            $('#freshWaterAllVolume').text("");
            $('#allNetWeight').text("");
        }
    }

    //???????????????????????????????????????
    function calCabinTotalAirWeight() {
        var cabinCarryTableRowCount = $("#cabinCarryTable tr").length - 3;
        if (cabinCarryTableRowCount > 0) {
            var airAllWeight = 0;
            for (var i = 0; i < cabinCarryTableRowCount; i++) {
                var airWeight = Number($('#cabinAirWeight' + i).text());
                var planCarryCount = Number($('#cabinPlanCarryCount' + i).text());
                var netWeight = Number(airWeight * planCarryCount);
                netWeight = (Math.round(netWeight * 10) / (10)).toFixed(1);
                //???????????????
                $("#cabinNetWeight" + i).text(netWeight);
                airAllWeight += airWeight * planCarryCount;
            }
            airAllWeight = (Math.round(airAllWeight * 10) / (10)).toFixed(1);
            $('#cabinAirAllWeight').text(Number(airAllWeight));
            var allNetWeight = Number(airAllWeight);
            allNetWeight = (Math.round(allNetWeight * 10) / (10)).toFixed(1);
            $('#cabinAllNetWeight').text(Number(allNetWeight));
        } else {
            $('#cabinAirAllWeight').text("");
            $('#cabinAllNetWeight').text("");
        }
    }

    var carryParameters;
    $.ajax({
        url: __ctx + '/accountingForm/getCarryToolList.rdm',
        async: false,
        success: function (data) {
            // console.log(data);
            //JSON.parse()??????????????????json??????
            var result = JSON.parse(data).results;
            carryParameters = result;
        }
    });

    //?????????/n
    function replaceBr(id){
        var content=$('#'+id);
        content.each(function(){
            var txt=$(this).text();
            txt=txt.trim();
            var j=0;
            var span=document.createElement("span");
            for (i=0;i<txt.length;i++){
                if (txt.charAt(i)=='\n'){
                    var p=document.createElement("p");
                    var partTxt=txt.slice(j,i);
                    p.innerHTML=partTxt;
                    //??????p?????????????????????????????????????????????????????????<br>
                    if (partTxt==''){
                        p.appendChild(document.createElement("br"));
                    }
                    span.appendChild(p);
                    j=i+1;
                }
            }
            var p_end=document.createElement("p");
            p_end.innerHTML=txt.slice(j);
            $(this).text('');
            span.appendChild(p_end);
            $(this).append(span);
        })
    }


    $(document).ready(function () {

        replaceBr('mainTask');
        replaceBr('workProgress');
        replaceBr('attention');

        layui.use('form', function () {
            var form = layui.form;

            $.ajax({
                url: __ctx + '/accountingForm/getPersons.rdm',
                async: false,
                data: {
                    "hangduanId": hangduanId,
                    "taskId": taskId
                },
                success: function (data) {
                    // console.log(data);
                    //JSON.parse()??????????????????json??????
                    var result = JSON.parse(data).results;
                    var selectorZuoxian = document.getElementById("selectZuoxian").innerHTML.trim();
                    var selectorMainDriver = document.getElementById("selectMainDriver").innerHTML.trim();
                    var selectorYouxian = document.getElementById("selectYouxian").innerHTML.trim();
                    if (selectorZuoxian == '-1') {
                        $("#selectZuoxian").text('');
                    }
                    if (selectorMainDriver == '-1') {
                        $("#selectorMainDriver").text('');
                    }
                    if (selectorYouxian == '-1') {
                        $("#selectorYouxian").text('');
                    }
                    for (var i = 0; i < result.length; i++) {
                        if (result[i].id == selectorZuoxian) {
                            $("#selectZuoxian").text(result[i].name);
                        } else if (result[i].id == selectorMainDriver) {
                            $("#selectMainDriver").text(result[i].name);
                        } else if (result[i].id == selectorYouxian) {
                            $("#selectYouxian").text(result[i].name);
                        }
                    }
                }
            });

            if (typeof showCarryToolList != 'undefined') {
                for (var j = 0; j < showCarryToolList.length; j++) {
                    var rowIndex = showCarryToolList[j].rowNumber;
                    var planCarryCount = showCarryToolList[j].carryCount;
                    var isCabinOutOrIn = showCarryToolList[j].isCabinOutOrIn;
                    var deviceName = '';
                    for (var i = 0; i < carryParameters.length; i++) {
                        if (carryParameters[i].id == showCarryToolList[j].deviceId) {
                            deviceName = carryParameters[i].name;
                            break;
                        }
                    }
                    if (showCarryToolList[j].rowNumber == 0) {
                        if ("in" == isCabinOutOrIn) {
                            $("#cabinSelectorCarryName0").text(deviceName);
                            $("#cabinPlanCarryCount0").text(showCarryToolList[j].carryCount);
                        } else {
                            $("#selectorCarryName0").text(deviceName);
                            $("#planCarryCount0").text(showCarryToolList[j].carryCount);
                        }
                        // break;
                    } else {
                        if ("in" == isCabinOutOrIn) {
                            cabinInsertNewRow(deviceName, showCarryToolList[j].rowNumber);
                        } else {
                            insertNewRow(deviceName, showCarryToolList[j].rowNumber);
                        }
                    }
                    var airWeight = showCarryToolList[j].airWeight;
                    var deWaterVolume = showCarryToolList[j].deWaterVolume;
                    var freshWaterWeight = showCarryToolList[j].freshWaterWeight;
                    var connectWay = showCarryToolList[j].connectWay;
                    if (showCarryToolList[j].isCabinOutOrIn == 'in') {
                        $('#cabinAirWeight' + rowIndex).text(airWeight);
                        $('#cabinPlanCarryCount' + rowIndex).text(planCarryCount);
                        $('#cabinConnectWay' + rowIndex).text(connectWay);
                        calCabinTotalAirWeight();
                    } else {
                        $('#airWeight' + rowIndex).text(airWeight);
                        $('#pWaterVolume' + rowIndex).text(deWaterVolume);
                        $('#freshWaterVolume' + rowIndex).text(freshWaterWeight);
                        $('#planCarryCount' + rowIndex).text(planCarryCount);
                        $('#connectWay' + rowIndex).text(connectWay);
                        caltotalAirWeight();
                    }
                }
            }
            var selectDivingDepthRedFlag;
            if (typeof isSubmitTable != "undefined" && isSubmitTable == 'submit') {
                $("input").attr("readonly", true);
                $('select').attr("disabled", "disabled");
                $("input[type='checkbox']").attr("disabled", true);
                // $("input[type='button']").attr("disabled", true);
                $("#exportDivingPlanWord").attr("disabled", false);
                $("textarea").attr("readonly", true);
                // $("#buttonGroup").remove();
                //????????????
                if (recordRed != '') {
                    var plan = recordRed.plan;
                    if (plan.length != 0) {
                        for (var k = 0; k < plan.length; k++) {
                            var name = plan[k].name;
                            if (name == 'seaArea') {
                                // $('#seaArea').addClass('red');
                                $('#seaArea').css("background-color", "red");
                            }
                            if (name == 'longtitude') {
                                $('#longtitude').css("background-color", "red");
                            }
                            if (name == 'latitude') {
                                $('#latitude').css("background-color", "red");
                            }
                            if (name == 'mainTask') {
                                $('#mainTask').css("background-color", "red");
                            }
                            if (name == 'workProgress') {
                                $('#workProgress').css("background-color", "red");
                            }
                            if (name == 'attention') {
                                $('#attention').css("background-color", "red");
                            }
                            if (name == 'selectDivingDepth') {
                                selectDivingDepthRedFlag = 1;
                            } else if (name == 'density') {
                                $('#density').css("background-color", "red");
                            }
                        }
                    }
                }
            }

            if (typeof isSubmitTable != "undefined" && isSubmitTable == 'submit') {
                //??????
                if (selectDivingDepthRedFlag == 1) {
                    $('#selectDivingDepth').css("background-color", "red");
                    $('#density').css("background-color", "red");
                }
                if (recordRed != '') {
                    var cabinOut = recordRed.cabinOut;
                    var cabinIn = recordRed.cabinIn;
                    if (typeof showCarryToolList != 'undefined') {
                        for (var d = 0; d < showCarryToolList.length; d++) {
                            var rowIndex = showCarryToolList[d].rowNumber;
                            var isCabinOutOrIn = showCarryToolList[d].isCabinOutOrIn;
                            if ("in" == isCabinOutOrIn) {
                                if (cabinIn.length != 0) {
                                    for (var t = 0; t < cabinIn.length; t++) {
                                        var deviceId = cabinIn[t].deviceId;
                                        if (showCarryToolList[d].deviceId == deviceId) {
                                            $('#cabinSelectorCarryName' + rowIndex).css("background-color", "red");
                                            break;
                                        }
                                    }
                                }
                            }
                            if ("out" == isCabinOutOrIn) {
                                if (cabinOut.length != 0) {
                                    for (var h = 0; h < cabinOut.length; h++) {
                                        var deviceId = cabinOut[h].deviceId;
                                        if (showCarryToolList[d].deviceId == deviceId) {
                                            $('#selectorCarryName' + rowIndex).css("background-color", "red");
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    });
</script>

</body>
</html>
