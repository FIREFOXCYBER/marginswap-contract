package com.marginswap.contracts;

import org.web3j.abi.*;
import org.web3j.abi.datatypes.*;
import org.web3j.abi.datatypes.generated.*;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.tx.Contract;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.utils.Numeric;
import java.util.stream.Collectors;

@javax.annotation.Generated(value="merklex-code-gen")
public class MarginSwap {
    public static final String BINARY = "608060405234801561001057600080fd5b50610fed806100206000396000f3fe6080604052600436106100865760003560e01c80635ccbf176116100595780635ccbf176146101ec57806368bde41f1461032857806369328dec1461037f578063a0985ba1146103fa578063c29982381461044b57610086565b80632d891fba14610088578063439370b11461010357806347e7ef241461010d57806357aee3661461015b575b005b34801561009457600080fd5b50610101600480360360608110156100ab57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291905050506104d1565b005b61010b610577565b005b6101596004803603604081101561012357600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610584565b005b34801561016757600080fd5b506101aa6004803603602081101561017e57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919050505061062d565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b3480156101f857600080fd5b50610326600480360360c081101561020f57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001906401000000008111156102a057600080fd5b8201836020820111156102b257600080fd5b803590602001918460018302840111640100000000831117156102d457600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f82011690508083019250505050505050919291929050505061063b565b005b34801561033457600080fd5b5061033d61090e565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561038b57600080fd5b506103f8600480360360608110156103a257600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610935565b005b34801561040657600080fd5b506104496004803603602081101561041d57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919050505061095a565b005b34801561045757600080fd5b506104cf6004803603602081101561046e57600080fd5b810190808035906020019064010000000081111561048b57600080fd5b82018360208201111561049d57600080fd5b803590602001918460208302840111640100000000831117156104bf57600080fd5b9091929391929390505050610976565b005b6104d9610f30565b6104e1610f52565b6001543318156104f65760016020526001603ffd5b60008484871561053b577fa9059cbb00000000000000000000000000000000000000000000000000000000855285600486015286602486015287905060449250600091505b602084848785855af1806105545760026020526001603ffd5b881561056c57845161056b5760036020526001603ffd5b5b505050505050505050565b610582600034610584565b565b61058c610f74565b610594610f52565b348318841516156105aa5760016020526001603ffd5b831561061d5734156105c15760026020526001603ffd5b7f23b872dd000000000000000000000000000000000000000000000000000000008252336004830152306024830152826044830152600081526020816064846000885af18151158115171561061b5760036020526001603ffd5b505b6106278484610b68565b50505050565b600081600501549050919050565b610643610f30565b61064b610f52565b60006001543318156106625760006020526001603ffd5b600160035418156106785760016020526001603ffd5b60026003556002547f0a681c590000000000000000000000000000000000000000000000000000000084528960048501528860248501526000806044866000855af1806106ca5760026020526001603ffd5b508915610727577f095ea7b30000000000000000000000000000000000000000000000000000000084528560048501528860248501526000835260208360448660008e5af1835115811517156107255760046020526001603ffd5b505b3031881561077b577f70a08231000000000000000000000000000000000000000000000000000000008552306004860152600084526020846024878c5afa806107755760056020526001603ffd5b50835190505b863b61078c5760056020526001603ffd5b898b1561079857600090505b600080885160208a01848c5af1806107b55760076020526001603ffd5b50508a15610814577f095ea7b3000000000000000000000000000000000000000000000000000000008552866004860152600060248601526000845260208460448760008f5af1845115811517156108125760086020526001603ffd5b505b30318915610868577f70a08231000000000000000000000000000000000000000000000000000000008652306004870152600085526020856024888d5afa806108625760096020526001603ffd5b50845190505b8181101561087b57600a6020526001603ffd5b81810393508884101561089357600b6020526001603ffd5b5050506108a08782610b68565b60008060c88a04915089820190506108bb8b82600254610d7d565b60016003558a8552886020860152896040860152826060860152816080860152867f4a2af5744adbfadba82ab831aea212bad92f5a70fef2079562044f423e99985160a087a25050505050505050505050565b600060045490508061093257733d9819210a31b4961b30ef54be2aed79b9c9cd3b90505b90565b60015433181561094a5760016020526001603ffd5b610955838383610d7d565b505050565b60015433181561096f5760016020526001603ffd5b8060045550565b60015433181561098b5760006020526001603ffd5b600435602018156109a15760016020526001603ffd5b6024356044368260200260440118156109bf5760026020526001603ffd5b604051368060008337600454806109e857733d9819210a31b4961b30ef54be2aed79b9c9cd3b90505b600482038383856000855af180610a045760036020526001603ffd5b835160201815610a195760046020526001603ffd5b6020840151861815610a305760056020526001603ffd5b6000805b87811015610a575760208102604087010151808317925050600181019050610a34565b508015610a695760066020526001603ffd5b5050505050602082028101815b81811015610b6057803560405160048101600081527f6f307dc3000000000000000000000000000000000000000000000000000000008252602081600484865afa80610ac75760076020526001603ffd5b5080518381600501558015610b51577f095ea7b30000000000000000000000000000000000000000000000000000000083528360048401527fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff602484015260448301600081526020816044866000865af181511581151715610b4e5760086020526001603ffd5b50505b50505050602081019050610a76565b505050505050565b610b70610f96565b610b78610f52565b836005015480610b8d5760646020526001603ffd5b7f17bfdfbc0000000000000000000000000000000000000000000000000000000083523060048401526020826024856000855af180610bd15760656020526001603ffd5b5081518080861015610be1578590505b8015610cad577f4e4d9fea0000000000000000000000000000000000000000000000000000000085526004818815610c45577f0e75270200000000000000000000000000000000000000000000000000000000875282600488015260249150600090505b602086838984895af180610c5e5760666020526001603ffd5b3d60008114610c7a5760208114610c905760696020526001603ffd5b8a15610c8b5760676020526001603ffd5b610ca3565b875115610ca25760686020526001603ffd5b5b5083890398505050505b50508315610d76577f1249c58b0000000000000000000000000000000000000000000000000000000083526004848615610d13577fa0712d6800000000000000000000000000000000000000000000000000000000855285600486015260249150600090505b602084838784875af180610d2c57606a6020526001603ffd5b3d60008114610d485760208114610d5e57606d6020526001603ffd5b8815610d5957606b6020526001603ffd5b610d71565b855115610d7057606c6020526001603ffd5b5b505050505b5050505050565b610d85610f96565b610d8d610f52565b846005015480610da25760c86020526001603ffd5b847f3af9e6690000000000000000000000000000000000000000000000000000000084523060048501526020836024866000865af180610de75760c96020526001603ffd5b5082518080831015610df7578290505b8015610e5a577f852a12e30000000000000000000000000000000000000000000000000000000086528060048701526020856024886000885af180610e415760ca6020526001603ffd5b855115610e535760cb6020526001603ffd5b8184039350505b50508015610ead577fc5ebeaec0000000000000000000000000000000000000000000000000000000084528060048501526020836024866000865af1835181151715610eab5760cc6020526001603ffd5b505b600086868915610ef2577fa9059cbb00000000000000000000000000000000000000000000000000000000875287600488015288602488015289905060449250600091505b602086848985855af180610f0b5760cd6020526001603ffd5b8a15610f23578651610f225760ce6020526001603ffd5b5b5050505050505050505050565b6040518060600160405280600390602082028038833980820191505090505090565b6040518060200160405280600190602082028038833980820191505090505090565b6040518060800160405280600490602082028038833980820191505090505090565b604051806040016040528060029060208202803883398082019150509050509056fea265627a7a723058200d03cd2137d294021e950e3b86ba8cd20916b5906fe769d1924f9dfa8882632264736f6c634300050a0032";
    public static Function transferOut(String asset, BigInteger amount, String destination) {
        return new Function(
            "transferOut",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(asset)
                , new UnsignedNumberType(256, amount)
                , new org.web3j.abi.datatypes.Address(destination)
            ),
            Collections.emptyList()
        );
    }
    public static Function transferOut(String asset, long amount, String destination) {
        return transferOut(
            asset
            , new BigInteger(Long.toUnsignedString(amount))
            , destination
        );
    }
    public static Function depositEth() {
        return new Function(
            "depositEth",
            Collections.emptyList(),
            Collections.emptyList()
        );
    }
    public static Function deposit(String asset_address, BigInteger amount) {
        return new Function(
            "deposit",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(asset_address)
                , new UnsignedNumberType(256, amount)
            ),
            Collections.emptyList()
        );
    }
    public static Function deposit(String asset_address, long amount) {
        return deposit(
            asset_address
            , new BigInteger(Long.toUnsignedString(amount))
        );
    }
    public static Function lookupUnderlying(String cToken) {
        return new Function(
            "lookupUnderlying",
            Collections.singletonList(
                new org.web3j.abi.datatypes.Address(cToken)
            ),
            Collections.singletonList(
                new TypeReference<org.web3j.abi.datatypes.Address>() {}
            )
        );
    }
    public static LookupunderlyingReturnValue query_lookupUnderlying(String contractAddress, Web3j web3j, Function function, DefaultBlockParameter block) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            block
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        LookupunderlyingReturnValue returnValue = new LookupunderlyingReturnValue();
        returnValue.result = (String) values.get(0).getValue();
        return returnValue;
    }
    public static LookupunderlyingReturnValue query_lookupUnderlying(String contractAddress, Web3j web3j, Function function) throws IOException {
        return query_lookupUnderlying(contractAddress, web3j, function, DefaultBlockParameterName.LATEST);
    }
    public static Function trade(String input_asset, BigInteger input_amount, String output_asset, BigInteger min_output_amount, String trade_contract, String trade_data) {
        return new Function(
            "trade",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(input_asset)
                , new UnsignedNumberType(256, input_amount)
                , new org.web3j.abi.datatypes.Address(output_asset)
                , new UnsignedNumberType(256, min_output_amount)
                , new org.web3j.abi.datatypes.Address(trade_contract)
                , new org.web3j.abi.datatypes.DynamicBytes(Numeric.hexStringToByteArray(trade_data))
            ),
            Collections.emptyList()
        );
    }
    public static Function trade(String input_asset, long input_amount, String output_asset, long min_output_amount, String trade_contract, String trade_data) {
        return trade(
            input_asset
            , new BigInteger(Long.toUnsignedString(input_amount))
            , output_asset
            , new BigInteger(Long.toUnsignedString(min_output_amount))
            , trade_contract
            , trade_data
        );
    }
    public static Function comptrollerAddress() {
        return new Function(
            "comptrollerAddress",
            Collections.emptyList(),
            Collections.singletonList(
                new TypeReference<org.web3j.abi.datatypes.Address>() {}
            )
        );
    }
    public static ComptrolleraddressReturnValue query_comptrollerAddress(String contractAddress, Web3j web3j, Function function, DefaultBlockParameter block) throws IOException {
        String encodedFunction = FunctionEncoder.encode(function);
        org.web3j.protocol.core.methods.response.EthCall ethCall = web3j.ethCall(
            Transaction.createEthCallTransaction("0x0000000000000000000000000000000000000000", contractAddress, encodedFunction),
            block
        ).send();
        String value = ethCall.getValue();
        List<Type> values = FunctionReturnDecoder.decode(value, function.getOutputParameters());
        ComptrolleraddressReturnValue returnValue = new ComptrolleraddressReturnValue();
        returnValue.comptroller = (String) values.get(0).getValue();
        return returnValue;
    }
    public static ComptrolleraddressReturnValue query_comptrollerAddress(String contractAddress, Web3j web3j, Function function) throws IOException {
        return query_comptrollerAddress(contractAddress, web3j, function, DefaultBlockParameterName.LATEST);
    }
    public static Function withdraw(String asset, BigInteger amount, String destination) {
        return new Function(
            "withdraw",
            Arrays.asList(
                new org.web3j.abi.datatypes.Address(asset)
                , new UnsignedNumberType(256, amount)
                , new org.web3j.abi.datatypes.Address(destination)
            ),
            Collections.emptyList()
        );
    }
    public static Function withdraw(String asset, long amount, String destination) {
        return withdraw(
            asset
            , new BigInteger(Long.toUnsignedString(amount))
            , destination
        );
    }
    public static Function setComptrollerAddress(String comptroller) {
        return new Function(
            "setComptrollerAddress",
            Collections.singletonList(
                new org.web3j.abi.datatypes.Address(comptroller)
            ),
            Collections.emptyList()
        );
    }
    public static Function enterMarkets(List<String> cTokens) {
        return new Function(
            "enterMarkets",
            Collections.singletonList(
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.Address>(org.web3j.abi.datatypes.Address.class, cTokens.stream().map(org.web3j.abi.datatypes.Address::new).collect(Collectors.toList()))
            ),
            Collections.emptyList()
        );
    }
    public static class Trade {
        public String trade_contract;
        public String from_asset;
        public String to_asset;
        public BigInteger input;
        public BigInteger output;
        public BigInteger input_fee;
    }
    public static final Event Trade_EVENT = new Event("Trade",
        Arrays.asList(
            new TypeReference<org.web3j.abi.datatypes.Address>(true) {}
            , new TypeReference<org.web3j.abi.datatypes.Address>() {}
            , new TypeReference<org.web3j.abi.datatypes.Address>() {}
            , new TypeReference<org.web3j.abi.datatypes.generated.Uint256>() {}
            , new TypeReference<org.web3j.abi.datatypes.generated.Uint256>() {}
            , new TypeReference<org.web3j.abi.datatypes.generated.Uint256>() {}
        )
    );
    public static final String Trade_EVENT_HASH = EventEncoder.encode(Trade_EVENT);
    public static Trade ExtractTrade(Log log) {
        List<String> topics = log.getTopics();
        if (topics.size() == 0 || !Trade_EVENT_HASH.equals(topics.get(0))) {
            return null;
        }
        EventValues values = Contract.staticExtractEventParameters(Trade_EVENT, log);
        Trade event = new Trade();
        event.trade_contract = (String) values.getIndexedValues().get(0).getValue();
        event.from_asset = (String) values.getNonIndexedValues().get(0).getValue();
        event.to_asset = (String) values.getNonIndexedValues().get(1).getValue();
        event.input = (BigInteger) values.getNonIndexedValues().get(2).getValue();
        event.output = (BigInteger) values.getNonIndexedValues().get(3).getValue();
        event.input_fee = (BigInteger) values.getNonIndexedValues().get(4).getValue();
        return event;
    }
    public static class LookupunderlyingReturnValue {
        public String result;
    }
    public static class ComptrolleraddressReturnValue {
        public String comptroller;
    }
}
