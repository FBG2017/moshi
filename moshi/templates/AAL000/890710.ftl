<#-- 账户列表查询服务 -->
<#assign PC_TRACODE="890710">
<#assign ESB_TRACODE="00000000890710">
<?xml version="1.0" encoding="UTF-8"?>
<Service>
  <#include "service_header.ftl" encoding="UTF-8" parse=true/>
  <Service_Body>
    <#include "ext_attributes.ftl" encoding="UTF-8" parse=true/>
    <request>
	    <I1RSFLAG>${DATA.I1RSFLAG}</I1RSFLAG>
	    <I1RSRCTP>${DATA.I1RSRCTP}</I1RSRCTP>
	    <I1BKIDTP>${DATA.I1BKIDTP}</I1BKIDTP>
		<I1BKIDNO>${DATA.I1BKIDNO}</I1BKIDNO>
	    <I1STSEQU>${DATA.I1STSEQU}</I1STSEQU>
	    <I1BKGPNO>${DATA.I1BKGPNO}</I1BKGPNO>
	    <I1S1REMK>${DATA.I1S1REMK}</I1S1REMK>
    </request>
  </Service_Body>
</Service>