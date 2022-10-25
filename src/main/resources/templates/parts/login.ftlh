<#macro login path isRegisterForm>
<form action="${path}" method="post">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Имя пользователя:</label>
        <div class="col-sm-6">
            <input type="text" name="username" value="<#if user??>${user.username!}</#if>"
                   class="form-control ${(usernameError??)?string('is-invalid', '')}"
                   placeholder="Имя пользователя" />
            <#if usernameError??>
                <div class="invalid-feedback">
                    ${usernameError}
                </div>
            </#if>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Пароль:</label>
        <div class="col-sm-6">
            <input type="password" name="password" value="<#if password??>${user.password!}</#if>"
                   class="form-control ${(passwordError??)?string('is-invalid', '')}"
                   placeholder="Пароль" />
            <#if passwordError??>
                <div class="invalid-feedback">
                    ${passwordError}
                </div>
            </#if>
        </div>
    </div>
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button id="btn-entry" class="btn btn-outline-success" type="submit"><#if isRegisterForm>Зарегистрироваться<#else>Войти</#if></button>
    <h5></h5>
    <#if !isRegisterForm><a href="/registration">Зарегистрироваться</a></#if>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button class="btn btn-outline-success" type="submit">Вход/Выход</button>
</form>
</#macro>