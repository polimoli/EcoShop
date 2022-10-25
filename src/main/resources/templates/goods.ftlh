<#import "parts/common.ftlh" as c>

<@c.page>
    <h9>К сожалению, мы работаем только на самовывоз из склада, если решили что-то заказать у нас - позвоните нам по номеру 8-(029)-974-549-39 или напишите нам в Telegram или Instagram (EcoForce_shop).
        Спасибо за понимание)</h9>
<div class="form-row">
    <div class="form-group col-md-6">
        <form method="get" action="/goods" class="form-inline">

            <input type="text" name="filter" class="form-control" value="${filter!}" placeholder="Поиск по категории">
            <button id="search" type="submit" class="btn btn-outline-success ml-2">Поиск</button>
        </form>
    </div>
</div>



<#include "parts/messageList.ftlh" />
</@c.page>