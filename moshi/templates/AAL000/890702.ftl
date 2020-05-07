<#-- 账户详细信息查询 -->
<#assign PC_TRACODE="890702">
<#assign ESB_TRACODE="00000000890702">
<?xml version="1.0" encoding="UTF-8"?>
<Service>
  <#include "service_header.ftl" encoding="UTF-8" parse=true/>
  <Service_Body>
    <#include "ext_attributes.ftl" encoding="UTF-8" parse=true/>
    <request>
      <I1BKACNO>${DATA.trcdno}</I1BKACNO><#-- 账号 -->
      <I1RSCCTP>00</I1RSCCTP><#-- 查询标志 每一位0:查询 1:不查询  第一位账户信息  第二位客户信息 -->
    </request>
  </Service_Body>
</Service>