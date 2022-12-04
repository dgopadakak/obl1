import java.util.Map;
import java.util.function.Function;

class Request {
    private String httpMethod;
    private Map<String, String> headers;
}

class Response {
    private int statusCode;
    private String body;

    public Response(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }
}

public class Handler implements Function<Request, Response>
{
    String s = "<style>.day {\n" +
            "\t border-radius:4px;\n" +
            "\t box-shadow: 0 0 10px rgba(0,0,0,0.5);\n" +
            "\t text-align:center;\n" +
            "\t padding:20px;\n" +
            "\t margin-bottom: 20px;\n" +
            "\t width:auto;\n" +
            " }\n" +
            "  .day, #demo {\n" +
            "     background-image: linear-gradient(141deg, #9fb8ad 0%, #6600FF 45%, #6600CC 75%);\n" +
            "} \n" +
            "#tablo {\n" +
            "    display: none;\n" +
            "    flex-flow: row wrap;\n" +
            "    align-items: stretch;\n" +
            "    justify-content: space-around;\n" +
            " }\n" +
            "#day1, #day2, #day3, #day4 {\n" +
            "\tfont-size:1.8em;\n" +
            "\tcolor:#e8ffe8;\n" +
            "\ttext-shadow: 0 0 5px #070707;\n" +
            " } \n" +
            "#demo7, #demo6, #demo10, #demo8, #demo14, #demo12, #demo18, #demo16 {\n" +
            "    font-size:.8em;\n" +
            "\tcolor:#FF66FF;\n" +
            " }\n" +
            "#demo5, #demo11, #demo15, #demo19 {\n" +
            "    font-size:1.3em;\n" +
            "\tcolor:#0768f0;\n" +
            " }\n" +
            "#demo4, #demo9, #demo13, #demo17 {\n" +
            "    font-size:1.3em;\n" +
            "\tcolor:#ff00bb;\n" +
            " }\n" +
            " input{\n" +
            "  font-size:16px;\n" +
            "  font-weight:bold;\n" +
            "  font-style:italic;\n" +
            "  border: solid 2px #68bcff;\n" +
            "  outline: 0;\n" +
            "  width: 30%;\n" +
            "  height: 36px;\n" +
            "  border-top-left-radius: 50px;\n" +
            "  border-bottom-left-radius: 50px;\n" +
            "  padding-left: 40px;\n" +
            "  margin: 10px 0px;\n" +
            "  z-index: 9999999;\n" +
            "}\n" +
            "#cityB {\n" +
            "  height: 40px;\n" +
            "  width: 40px;\n" +
            "  border: solid 2px #68bcff;\n" +
            "  border-left: none;\n" +
            "  outline: 0;\n" +
            "  border-top-right-radius: 50px;\n" +
            "  border-bottom-right-radius: 50px;\n" +
            "  padding-right: 5px;\n" +
            "  margin-left:-6px;\n" +
            "  background: #68bcff;\n" +
            "  color: #fff;\n" +
            "}\n" +
            ".text-center {\n" +
            "  background: radial-gradient(circle at 65% 15%, #6699FF, #660066);\n" +
            "  font-family:Open Sans;\n" +
            "  font-size:32px;\n" +
            "  color: #ffffff;\n" +
            "  text-shadow: 1px 1px 2px black, 0 0 1em #ffffff;\n" +
            "  text-align:center;\n" +
            " }\n" +
            "#cityC {\n" +
            " color:#8df2a1;\n" +
            " font-size:26px;\n" +
            " padding:10px;\n" +
            "}\n" +
            ".select { \n" +
            "  display: block; \n" +
            "  font-size: 16px; \n" +
            "  font-family: sans-serif; \n" +
            "  font-weight: 700; \n" +
            "  color: #444; \n" +
            "  line-height: 1.3; \n" +
            "  padding: .6em 1.4em .5em .8em; width: 100%; \n" +
            "  max-width: 200px; \n" +
            "  box-sizing: border-box; \n" +
            "  margin: 0; \n" +
            "  border: 1px solid #aaa;\n" +
            "  box-shadow: 0 1px 0 1px rgba(0,0,0,.04); \n" +
            "  border-radius: .5em;\n" +
            " -moz-appearance: none;\n" +
            " -webkit-appearance: none;\n" +
            "  appearance: none;\n" +
            "  background-color: #fff; \n" +
            "  background-image: url('data:image/svg+xml;charset=US-ASCII,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%22292.4%22%20height%3D%22292.4%22%3E%3Cpath%20fill%3D%22%23007CB2%22%20d%3D%22M287%2069.4a17.6%2017.6%200%200%200-13-5.4H18.4c-5%200-9.3%201.8-12.9%205.4A17.6%2017.6%200%200%200%200%2082.2c0%205%201.8%209.3%205.4%2012.9l128%20127.9c3.6%203.6%207.8%205.4%2012.8%205.4s9.2-1.8%2012.8-5.4L287%2095c3.5-3.5%205.4-7.8%205.4-12.8%200-5-1.9-9.2-5.5-12.8z%22%2F%3E%3C%2Fsvg%3E'), linear-gradient(to bottom, #ffffff 0%,#e5e5e5 100%); \n" +
            "  background-repeat: no-repeat, repeat;\n" +
            "  background-position: right .7em top 50%, 0 0;\n" +
            "  background-size: .65em auto, 100%; \n" +
            "} \n" +
            " .select::-ms-expand { display: none; } \n" +
            " .select:hover { border-color: #888; } \n" +
            " .select:focus { border-color: #aaa; \n" +
            "  box-shadow: 0 0 1px 3px rgba(59, 153, 252, .7);\n" +
            "  box-shadow: 0 0 0 3px -moz-mac-focusring; \n" +
            "  color: #222;\n" +
            "  outline: none; \n" +
            "} \n" +
            " .select option { font-weight:normal; } \n" +
            " *[dir=\"rtl\"] .select, :root:lang(ar) .select, :root:lang(iw) .select { \n" +
            "  background-position: left .7em top 50%, 0 0; \n" +
            "  padding: .6em .8em .5em 1.4em; \n" +
            "}\n" +
            "@media all and (max-width: 900px){\n" +
            "\tinput{\n" +
            "  font-size:12px;\n" +
            "  font-weight:normal;\n" +
            "  font-style:italic;\n" +
            "  border: solid 1px #68bcff;\n" +
            "  outline: 0;\n" +
            "  width: 70%;\n" +
            "  height: 30px;\n" +
            "}\n" +
            "button{\n" +
            "  height: 30px;\n" +
            "  width: 30px;\n" +
            "  border: solid 1px #68bcff;\n" +
            "}\n" +
            "}</style>" +
            "<div class=\"left\">\n" +
            "<h2>Введите название города</h2>\n" +
            " <input type=\"text\" id=\"city\" placeholder=\"Введите название города...\"/>\n" +
            " <button id=\"cityB\" onclick=\"showDateTime();\">OK</button>\n" +
            "<p class=\"text-center\">Прогноз на 4 дня <br><span id=\"cityC\"></span><p>\t\n" +
            "\t<div id=\"tablo\">            \n" +
            "\t\t<div class=\"day\">\n" +
            "\t\t\t  <img id=\"tmp4\"/><br>\n" +
            "\t\t\t <p id=\"day1\"></p>\n" +
            "\t\t\t <div id=\"demo7\"></div>\n" +
            "\t\t\t <div id=\"demo5\" ></div>\n" +
            "\t\t\t <div id=\"demo6\"></div>\n" +
            "\t\t\t <div id=\"demo4\"></div>\n" +
            "\t\t</div>\n" +
            "\n" +
            "\t\t<div class=\"day\">\n" +
            "\t\t\t   <img id=\"tmp5\"/><br>\n" +
            "\t\t\t <p id=\"day2\"></p>\n" +
            "\t\t\t <div id=\"demo10\"></div>\n" +
            "\t\t\t <div id=\"demo11\"></div>\n" +
            "\t\t\t <div id=\"demo8\"></div>\n" +
            "\t\t\t <div id=\"demo9\"></div>\n" +
            "\t\t</div> \n" +
            "\n" +
            "\t\t<div class=\"day\">\n" +
            "\t\t\t   <img id=\"tmp6\"/><br>\n" +
            "\t\t\t <p id=\"day3\"></p>\n" +
            "\t\t\t <div id=\"demo14\"></div>\n" +
            "\t\t\t <div id=\"demo15\"></div>\n" +
            "\t\t\t <div id=\"demo12\"></div>\n" +
            "\t\t\t <div id=\"demo13\"></div>\n" +
            "\t\t</div> \n" +
            "\n" +
            "\t\t<div class=\"day\">\n" +
            "\t\t\t   <img id=\"tmp7\"/><br>\n" +
            "\t\t\t <p id=\"day4\"></p>\n" +
            "\t\t\t <div id=\"demo18\"></div>\n" +
            "\t\t\t <div id=\"demo19\"></div>\n" +
            "\t\t\t <div id=\"demo16\"></div>\n" +
            "\t\t\t <div id=\"demo17\"></div>\n" +
            "\t\t</div>\n" +
            "  </div>\n" +
            "  </div>\n" +
            "<script src=\"https://code.jquery.com/jquery-1.11.1.min.js\"></script>\n" +
            "<script>$(function(){\n" +
            "  let input = $('#city'),\n" +
            "      inpVal = input.val();\n" +
            "  \n" +
            "  $('.select').on('change', function(){\n" +
            "    input.val(inpVal + $(this).val());\n" +
            "  });\n" +
            "});\n" +
            "\n" +
            "$('#cityB').on('click', function(){\n" +
            "\t$('#tablo').css('display','flex');\n" +
            "\t\t\t\n" +
            "\tvar city=$('#city').val();\n" +
            "  //Здесь вам нужно вставить свой бесплатный ключ\n" +
            "\tvar apiURI2 = `https://api.openweathermap.org/data/2.5/forecast?q=${city}&appid=32cdf4d94f91f04541390ada5241e152`;\n" +
            "\t\tconsole.log(\"success getWeather2\");\n" +
            "\t\tconsole.log(apiURI2);\n" +
            "\t\t$.ajax({\n" +
            "\t\t  url: apiURI2,\n" +
            "\t\t  dataType: \"jsonp\",\n" +
            "\t\t  type: \"GET\",\n" +
            "\t\t  async: \"true\",\t\t \n" +
            "\t      timeout : 500,\n" +
            "                    success : function(data) {\n" +
            "                        console.log(\"Success\");\n" +
            "                    },\n" +
            "                    error : function(e) {\n" +
            "                        console.log(\"Error\");\n" +
            "\t\t\t\t\t\t$('#cityC').html('<p style=\"color:red\";>ERROR</p><p style=\"color:#bef7f1\";>Проверьте корректность названия</p>');\n" +
            "\t\t\t\t\t\t$('#tablo').css('display','none');\n" +
            "                    },\n" +
            "                    done : function(e) {\n" +
            "                        console.log(\"DONE\");\n" +
            "                    },  \n" +
            "\t\t}).done(dataHandler3);\n" +
            "\t\n" +
            "$('#cityC').text('в' + ' ' + city);\t \n" +
            "function dataHandler3(data) {\n" +
            "\tdataString = JSON.stringify(data);\n" +
            "\tvar now = new Date();\n" +
            "\tlet h = now.getHours();\n" +
            "    var num = 8-(Math.floor(h/3));\n" +
            "//завтра\n" +
            "\t\tdocument.getElementById(\"demo6\").innerHTML = data.list[num+3].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo4\").innerHTML = \"Макс.\" + \" \" + Math.floor((data.list[num+3].main[\"temp\"])-273,15)+\"°C\";\n" +
            "\t\tdocument.getElementById(\"demo7\").innerHTML = data.list[num].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo5\").innerHTML = \"Мин.\" +  \" \" + Math.floor((data.list[num].main[\"temp\"])-273,15)+\"°C\";\n" +
            "\t\tvar imgURL = \"https://openweathermap.org/img/w/\" + data.list[num+3].weather[0].icon + \".png\";\n" +
            "\t\t$(\"#tmp4\").attr(\"src\", imgURL);\n" +
            "//послезавтра\n" +
            "\t\tdocument.getElementById(\"demo8\").innerHTML = data.list[num+11].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo9\").innerHTML = \"Макс. \" + \" \" + Math.floor((data.list[num+11].main[\"temp\"])-273,15)+\"°C\";\n" +
            "\t\tdocument.getElementById(\"demo10\").innerHTML = data.list[num+8].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo11\").innerHTML = \"Мин.\" +  \" \" + Math.floor((data.list[num+9].main[\"temp\"])-273,15)+\"°C\";\n" +
            "\t\tvar imgURL = \"https://openweathermap.org/img/w/\" + data.list[num+11].weather[0].icon + \".png\";\n" +
            "\t\t$(\"#tmp5\").attr(\"src\", imgURL);\n" +
            "//после-послезавтра\n" +
            "\t\tdocument.getElementById(\"demo12\").innerHTML = data.list[num+19].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo13\").innerHTML = \"Макс.\" + \" \" + Math.floor((data.list[num+19].main[\"temp\"])-273,15)+\"°C\";\n" +
            "\t\tdocument.getElementById(\"demo14\").innerHTML = data.list[num+16].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo15\").innerHTML = \"Мин.\" +  \" \" + Math.floor((data.list[num+17].main[\"temp\"])-273,15)+\"°C\";\n" +
            "        var imgURL = \"https://openweathermap.org/img/w/\" + data.list[num+19].weather[0].icon + \".png\";\n" +
            "\t\t$(\"#tmp6\").attr(\"src\", imgURL);\t\t\n" +
            "//после-после-послезавтра\t\n" +
            "\t\tdocument.getElementById(\"demo16\").innerHTML = data.list[num+27].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo17\").innerHTML = \"Макс.\" + \" \" + Math.floor((data.list[num+27].main[\"temp\"])-273,15)+\"°C\";\n" +
            "\t\tdocument.getElementById(\"demo18\").innerHTML = data.list[num+24].dt_txt;\n" +
            "\t\tdocument.getElementById(\"demo19\").innerHTML = \"Мин.\" +  \" \" + Math.floor((data.list[num+25].main[\"temp\"])-273,15)+\"°C\";\n" +
            "        var imgURL = \"https://openweathermap.org/img/w/\" + data.list[num+27].weather[0].icon + \".png\";\n" +
            "\t\t$(\"#tmp7\").attr(\"src\", imgURL);\t\t\n" +
            "\t\t\t\t\n" +
            "   }\n" +
            " \n" +
            "   });\n" +
            " //Показ дни недели \n" +
            "  function showDateTime() {\n" +
            "\t\t\t\t\n" +
            "\t\t\t\t\n" +
            "\t\t\t\tvar d = new Date();\n" +
            "\t\t\t\tvar n1, n2, n3, n4, n5;\n" +
            "\t\t\t\tvar weekday = new Array(7);\n" +
            "\t\t\t\t\tweekday[0] = \"Воскресенье\";\n" +
            "\t\t\t\t\tweekday[1] = \"Понедельник\";\n" +
            "\t\t\t\t\tweekday[2] = \"Вторник\";\n" +
            "\t\t\t\t\tweekday[3] = \"Среда\";\n" +
            "\t\t\t\t\tweekday[4] = \"Четверг\";\n" +
            "\t\t\t\t\tweekday[5] = \"Пятница\";\n" +
            "\t\t\t\t\tweekday[6] = \"Суббота\";\n" +
            "\t\t\t\t\t \n" +
            "\t\t\t\t\t if(d.getDay() >= 3){\n" +
            "\t\t\t\t\t\t   n1 = weekday[(d.getDay()+1)];\n" +
            "\t\t\t\t\t\t   n2 = weekday[(d.getDay()+2)];\n" +
            "\t\t\t\t\t\t   n3 = weekday[(d.getDay()+3)];\n" +
            "\t\t\t\t\t\t   n4 = weekday[7-(d.getDay()+4)];} if(d.getDay() >= 4)\n" +
            "\t\t\t\t\t     {\n" +
            "\t\t\t\t\t\t   n1 = weekday[(d.getDay()+1)];\n" +
            "\t\t\t\t\t\t   n2 = weekday[(d.getDay()+2)];\n" +
            "\t\t\t\t\t\t   n3 = weekday[7-(d.getDay()+3)];\n" +
            "\t\t\t\t\t\t   n4 = weekday[9-(d.getDay()+4)];} if(d.getDay() >= 5)\n" +
            "\t\t\t\t\t     {\n" +
            "\t\t\t\t\t\t   n1 = weekday[(d.getDay()+1)];\n" +
            "\t\t\t\t\t\t   n2 = weekday[7-(d.getDay()+2)];\n" +
            "\t\t\t\t\t\t   n3 = weekday[9-(d.getDay()+3)];\n" +
            "\t\t\t\t\t\t   n4 = weekday[11-(d.getDay()+4)];} if(d.getDay() >= 6)\n" +
            "\t\t\t\t\t     {\n" +
            "\t\t\t\t\t\t   n1 = weekday[7-(d.getDay()+1)];\n" +
            "\t\t\t\t\t\t   n2 = weekday[9-(d.getDay()+2)];\n" +
            "\t\t\t\t\t\t   n3 = weekday[11-(d.getDay()+3)];\n" +
            "\t\t\t\t\t\t   n4 = weekday[13-(d.getDay()+4)];}  if(d.getDay() < 3) \n" +
            "\t\t\t\t\t\t {\n" +
            "\t\t\t\t\t       n1 = weekday[(d.getDay()+1)];\n" +
            "\t\t\t\t\t\t   n2 = weekday[(d.getDay()+2)];\n" +
            "\t\t\t\t\t\t   n3 = weekday[(d.getDay()+3)];\n" +
            "\t\t\t\t\t\t   n4 = weekday[(d.getDay()+4)];\n" +
            "\t\t\t\t\t\t  \n" +
            "\t\t\t\t\t     }\n" +
            "\t\t\t\t\t\t\n" +
            "\t\t\t\t\t\t\t\tdocument.getElementById(\"day1\").innerHTML = n1;\n" +
            "\t\t\t\t\t\t\t\tdocument.getElementById(\"day2\").innerHTML = n2;\n" +
            "\t\t\t\t\t\t\t\tdocument.getElementById(\"day3\").innerHTML = n3;\n" +
            "\t\t\t\t\t\t\t\tdocument.getElementById(\"day4\").innerHTML = n4;\t\t\t\t\t\t\t\t\n" +
            "\t\t\t}\n" +
            "\t\t\t\tshowDateTime();</script>";

    @Override
    public Response apply(Request request)
    {
        return new Response(200, s);
    }

    private String printSecondLine()
    {
        return "\nВторая строка";
    }
}
