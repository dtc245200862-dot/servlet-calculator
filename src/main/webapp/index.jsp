<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Simple Calculator</title>
    <style>
        fieldset {
            width: 350px;
            padding: 15px;
            border-radius: 6px;
            border: 1px solid #ccc;
        }
        table td {
            padding: 6px;
        }
        input[type="text"], select {
            width: 160px;
            padding: 4px;
        }
        input[type="submit"] {
            padding: 6px 16px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="calculate">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand: </td>
                <td><input name="first-operand" type="text" required/></td>
            </tr>
            <tr>
                <td>Operator: </td>
                <td>
                    <select name="operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand: </td>
                <td><input name="second-operand" type="text" required/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculate"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
