<#include "security.ftlh">

<div class="card-group">
    <#list messages as message>
        <div class="card my-3">
            <#if message.filename??>
                <img src="/img/${message.filename}" class="card-img-top">
            </#if>
            <div class="m-2">
                <span>${message.text}</span><br/>
                <i>${message.tag}</i>
            </div>

        </div>
    <#else>
        Нет товаров
    </#list>
</div>